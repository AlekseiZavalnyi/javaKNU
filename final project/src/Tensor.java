package org.javapractices.project;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.Iterator;



public class Tensor<T extends Number> {
    private Class<T> type;
    int[] shape;
    private T[] data;
    private int[] strides;
    private int size;
    
    
     /**
     * Constructs a tensor with the given shape and data.
     *
     * @param type  determines the type of the values of the tensor.
     * @param shape determines the shapes of the dimensions of the tensor where each shape should be a (strictly) positive integer.
     * @param data  determines the numbers that will create the tensor.
     * @throws      InvalidShapeException when a zero or a negative number is found in the shape array.
     * @throws      DataSizeException when the length of the given array does not equal the calculated size of the tensor. 
     */
    Tensor(Class<T> type, int[] shape, T[] data) {
        this.size = prod(shape);
        if (size != data.length){
            throw new DataSizeException("given array size: " + data.length + ", but should be " + size);
        }
        
        if (checkPositivity(shape)){
            this.type = type;
            this.shape = shape;
            this.data = data;
            this.strides = initializeStrides(shape);
        }
    }
    
     /**
     * Constructs a tensor with the given shape filled with the given value of the given type.
     *
     * @param type  determines the type of the values of the tensor.
     * @param shape determines the shapes of the dimensions of the tensor where each shape should be a (strictly) positive integer.
     * @param num   the number that fill the tensor
     * @throws      InvalidShapeException when a zero or a negative number is found in the shape array.
     */
    Tensor(Class<T> type, int[] shape, T num){
        if (checkPositivity(shape)){
            this.type = type;
            this.shape = shape;
            this.size = prod(shape);
            this.strides = initializeStrides(shape);
            this.data = (T[]) Array.newInstance(type, size);
            for (int i = 0; i < prod(shape); i++){
                Array.set(data, i, num);
            }
        }
    }
    
     /**
     * Constructs a tensor with the given shape filled with default values of the given type.
     *
     * @param type  determines the type of the values of the tensor.
     * @param shape determines the shapes of the dimensions of the tensor where each shape should be a (strictly) positive integer.
     * @throws      InvalidShapeException when a zero or a negative number is found in the shape array.
     */
    Tensor (Class<T> type, int[] shape){
        if (checkPositivity(shape)){
            this.type = type;
            this.shape = shape;
            this.size = prod(shape);
            this.strides = initializeStrides(shape);
            this.data = (T[]) Array.newInstance(type, size);
        }
    }
    
    /** Strides are used to map a multi-dimensional index to a flat index.
     *  The stride of a dimension is calculated by taking the product of all 
     *  the dimension sizes (shapes).
     *  
     * @return strides.
     */
    private int[] initializeStrides(int[] shape) {
        int[] strides = new int[shape.length];
        int currentStride = 1;
        for (int i = shape.length - 1; i >= 0; i--) {
            strides[i] = currentStride;
            currentStride *= shape[i];
        }
        return strides;
    }
    
    /** Calculates the size of the tensor.
     * 
     * @param shape array of dimensions of the tensor.
     * @return      size.
     */
    private static int prod(int[] shape){
        int p = 1;
        for (int i: shape){
            p *= i;
        }
        return p;
    }
    
    /** Checks if the dimensions are non-positive.
     * 
     * @param shape array of dimensions.
     * @return      boolean value.
     */
    private static boolean checkPositivity(int[] shape){
        for (int i: shape){
            if (i <= 0){
                throw new InvalidShapeException("given non-positive number as a dimension: " + i);
            }
        }
        return true;
    }
    
    /** Myltiplies the tensor by a constant.
     * 
     * @param num constant.
     * @return    new tensor.
     */
    public Tensor<T> multByConstant(T num){
        Tensor<T> t = new Tensor<>(type, shape);
        T[] dataT = (T[]) data;
        for (int i = 0; i < data.length; i++){
            dataT[i] = Numbers.multiply(type, num, data[i]);
        }
        t.setData(dataT);
        return t;
    }
    
    /** Adds two tensors.
     * 
     * @param tensorT second tensor.    
     * @return        sum of the tensors.
     */
    public Tensor<T> add(Tensor tensorT){
        Class<T> typeT = tensorT.getType();
        int[] shapeT = tensorT.getShape();
        if (!type.equals(typeT)){
            throw new InvalidTypeException("given tensor has a different type: " + typeT);
        }
        
        if (!Arrays.equals(shape, shapeT)){
            throw new InvalidShapeException("given tensor has a different shape: " + Arrays.toString(shapeT));
        }
        
        Tensor<T> t = new Tensor<>(type, shape);
        T[] dataT = (T[]) tensorT.getData();
        T[] new_data = (T[]) Array.newInstance(type, size);
        for (int i = 0; i < size; i++){
            Array.set(new_data, i, Numbers.add(type, data[i], dataT[i]));
        }
        t.setData(new_data);
        return t;
    }
    
    /** Substracts given tensor.
     * 
     * @param tensorT second tensor.     
     * @return        new tensor.
     */
    public Tensor<T> minus(Tensor tensorT){
        Class<T> typeT = tensorT.getType();
        int[] shapeT = tensorT.getShape();
        
        if (!type.equals(typeT)){
            throw new InvalidTypeException("given tensor has a different type: " + typeT);
        }
        
        if (!Arrays.equals(shape, shapeT)){
            throw new InvalidShapeException("given tensor has a different shape: " + Arrays.toString(shapeT));
        }
        
        Tensor<T> t = new Tensor<>(type, shape);
        T[] dataT = (T[]) tensorT.getData();
        T[] new_data = (T[]) Array.newInstance(type, size);
        for (int i = 0; i < size; i++){
            Array.set(new_data, i, Numbers.minus(type, data[i], dataT[i]));
        }
        t.setData(new_data);
        return t;
    }
    
    /** Creates a tensor with opposite values.
     * 
     * @return opposite tensor.
     */
    public Tensor<T> negate(){
        Tensor<T> t = new Tensor<>(type, shape);
        T[] dataT = (T[]) data;
        for (int i = 0; i < data.length; i++){
            dataT[i] = Numbers.minus(type, Numbers.zero(type), data[i]);
        }
        t.setData(dataT);
        return t;
    }
    
    /** Matrix multiplication (A * B).
     * 
     * @param matrix tensor B.
     * @return       A * B.
     */
    public Tensor<T> mm(Tensor matrix){
        Class<T> typeM = matrix.getType();
        int[] shapeM = matrix.getShape();
        
        if (!type.equals(typeM)){
            throw new InvalidTypeException("given tensor has a different type: " + typeM);
        }
        
        if (shapeM.length != 2 || shape.length != 2){
            throw new InvalidShapeException("for matrix multiplication, the tensors must have shape <= 2");
        }
        
        if (shape[1] != shapeM[0]){
            throw new InvalidShapeException("matrices cannot be multiplied: " + Arrays.toString(shape)
                    + ", " + Arrays.toString(shapeM));
        }
        
        if (shape[0] == shapeM[1] && shape[0] == 1){
            Tensor<T> res = new Tensor<>(type, new int[] {shape[0], shapeM[1]});
            T num = Numbers.zero(type);
            T[] dataM = (T[]) matrix.getData();
            for (int i = 0; i < shape[1]; i++){
                num = Numbers.add(type, num, Numbers.multiply(type, data[i], dataM[i]));
            }
            res.setItem(new int[] {0, 0}, num);
            return res;
        }
        
        Tensor<T> res = new Tensor<>(type, new int[] {shape[0], shapeM[1]}, Numbers.zero(type));
        
        Tensor<T> m = this;
        for (int i = 0; i < shape[0]; i++){
            for (int j = 0; j < shapeM[1]; j++){
                for (int k = 0; k < shapeM[0]; k++){
                    T number = res.getItem(new int[] {i, j});
                    T a = (T) Numbers.multiply(type, (T) m.getItem(new int[] {i, k}), (T) matrix.getItem(new int[] {k, j}));
                    res.setItem(new int[] {i, j}, Numbers.add(type, number, a));
                }
            }
        }
        return res;
    }
    
    /** Implementation of a Kronecker product (https://en.wikipedia.org/wiki/Kronecker_product).
     * 
     * @param matrix tensor B.
     * @return       A ⊗ B.
     */
    public Tensor<T> kroneckerProd(Tensor<T> matrix){
        Class<T> typeM = matrix.getType();
        int[] shapeM = matrix.getShape();
        if (!type.equals(typeM)){
            throw new InvalidTypeException("given tensor has a different type: " + typeM);
        }
        
        if (shapeM.length != 2 || shape.length != 2){
            throw new InvalidShapeException("the tensors must have shape <= 2");
        }
        
        Tensor<T> res = new Tensor<> (type, new int[] {shape[0]*shapeM[0], shape[1]*shapeM[1]}, Numbers.zero(type));
        Tensor<T> m = this;
        for (int i = 0; i < shape[0]; i++){
            for (int k = 0; k < shape[1]; k++){
                for (int j = 0; j < shapeM[0]; j++){
                    for (int l = 0; l < shapeM[1]; l++){
                        T a = (T) Numbers.multiply(type, (T) m.getItem(new int[] {i, k}), (T) matrix.getItem(new int[] {j, l}));
                        res.setItem(new int[] {shapeM[0]*i + j, shapeM[1]*k + l}, a);
                    }
                }
            }
        }
        return res;
    }
   
    /** Multiplies two tensors with number of dimensions > 3.
     * 
     * @param matrix tensor B.
     * @return       A * B.
     */
    public Tensor<T> matmult(Tensor<T> matrix){
        int[] shapeM = (int[]) matrix.getShape();
        
        if (shape.length < 3 || shapeM.length < 3){
            throw new InvalidShapeException("the tensors must have shape >= 3");
        }
        
        Class<T> typeM = matrix.getType();
        
        if (!type.equals(typeM)){
            throw new InvalidTypeException("given tensor has a different type: " + typeM);
        }
        
        if (shape[shape.length-1] != shapeM[shapeM.length-2]){
            throw new InvalidShapeException("tensors cannot be multiplied: " + Arrays.toString(shape)
                    + ", " + Arrays.toString(shapeM));
        }
        
        T[] dataM = (T[]) matrix.getData();
        int[] new_shape;
        int min_len;
        if (shape.length < shapeM.length){
            min_len = shape.length;
            new_shape = Arrays.copyOf(matrix.getShape(), matrix.getShape().length);
        } else{
            min_len = shapeM.length;
            new_shape = Arrays.copyOf(this.getShape(), this.getShape().length);
        }
        
        new_shape[new_shape.length - 2] = shape[shape.length - 2];
        new_shape[new_shape.length - 1] = shapeM[shapeM.length - 1];
        for (int i = 0; i < min_len - 2; i++){
            if (shape[shape.length - 3 - i] != shapeM[shapeM.length - 3 - i]){
                throw new InvalidShapeException("tensors cannot be multiplied: " + Arrays.toString(shape)
                    + ", " + Arrays.toString(shapeM));
            }
        }
        
        boolean first = true;
        int size_h = size;
        int size_l = prod(shapeM);
        T[] data_h = this.getData();
        T[] data_l = matrix.getData();
        int m2 = shape[shape.length-1]*shape[shape.length-2];
        int m1 = shapeM[shapeM.length-1]*shapeM[shapeM.length-2];
        int[] shape_h = new int[] {shape[shape.length-1], shape[shape.length-2]};
        int[] shape_l = new int[] {shapeM[shapeM.length-1], shapeM[shapeM.length-2]};
        if (size_l > size_h){
            first = false;
            size_l = size;
            size_h = prod(shapeM);
            data_l = this.getData();
            data_h = matrix.getData();
            m2 = shapeM[shapeM.length-1]*shapeM[shapeM.length-2];
            m1 = shape[shape.length-1]*shape[shape.length-2];
            shape_l = new int[] {shape[shape.length-1], shape[shape.length-2]};
            shape_h = new int[] {shapeM[shapeM.length-1], shapeM[shapeM.length-2]};
        }
        
        int num = size_l / m1;
        boolean flag = true;
        T[] x = (T[]) Array.newInstance(type, m2); 
        int j = 0;        
        
        int new_m = new_shape[new_shape.length-1]*new_shape[new_shape.length-2];
        Tensor<T> res = new Tensor<> (type, new_shape, Numbers.zero(type));
        T[] res_data = (T[]) Array.newInstance(type, prod(new_shape)); 
        int r = 0;
                
        for (int i = 0; i < size_h; i++){
            if (i % m2 < m2 && flag){
                x[i % m2] = data_h[i];
            }
            if (i % m2 == m2 - 1){
                flag = false;
                j += 1;
            }
            
            if (!flag){
                flag = true;
                T[] y = Arrays.copyOfRange(data_l, (j - 1)*m1, j*m1);  
                
                Tensor<T> x_t = new Tensor<> (type, shape_h, x);
                Tensor<T> y_t = new Tensor<> (type, shape_l, y);
                
                T[] new_t;
                if (first){
                    new_t = y_t.mm(x_t).getData();
                } else {
                    new_t = x_t.mm(y_t).getData();
                }
                
                for (int k = 0; k < new_t.length; k++){
                    res_data[k + r] = new_t[k];
                }
                r += new_m;
                if (j % num == 0){
                    j = 0;
                }
            }
        }
        
        res.setData(res_data);
        return res;
    }
    
    /** Writes tensor to a .json file.
     */
    public void writeJson(String s){
        String path = s;
        JSONObject tensor = new JSONObject();
        tensor.put("type", type.getSimpleName());

        JSONArray shape_list = new JSONArray();
        JSONArray data_list = new JSONArray();
        for (int i = 0; i < shape.length; i++){
            shape_list.add(Integer.toString(shape[i]));
        }
        
        for (int i = 0; i < data.length; i++){
            data_list.add(Numbers.toStr(type, data[i]));
        }
        
        tensor.put("shape", shape_list);
        tensor.put("values", data_list);
        
        try (FileWriter file = new FileWriter(path)) {
            file.write(tensor.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /** Reads and takes tensor values from a .json file.
     */
    public void readJson(String s){
        String path = s;
        try (Reader reader = new FileReader(path)) {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            
            JSONArray arr = (JSONArray) jsonObject.get("shape");
            Iterator<String> iterator_shape = arr.iterator();
            int[] new_shape = new int[arr.size()];
            
            int i = 0;
            while (iterator_shape.hasNext()){
                new_shape[i] = Integer.parseInt((String) iterator_shape.next());
                i++;
            }
            
            JSONArray arr_data = (JSONArray) jsonObject.get("values");
            Iterator<String> iterator_data = arr_data.iterator();
            T[] new_data = (T[]) Array.newInstance(type, prod(new_shape));

            String name = (String) jsonObject.get("type");
            
            if (Numbers.getType(name).equals(type)){

                i = 0;
                while (iterator_data.hasNext()){
                    new_data[i] = Numbers.fromStr(type, (String) iterator_data.next());
                    i++;
                }
            } else{
                throw new InvalidTypeException("tensor from .json file has a different type: "
                        + Numbers.getType(name).toString());
            }

            this.data = new_data;
            this.shape = new_shape;
            this.strides = initializeStrides(shape);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * @param indices an array containing an index for each dimension of the tensor.
     * @return        index of the element in a data array.
     */
    private int dataIndex(int[] indices) {
        int index = 0;
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] < 0 || indices[i] >= shape[i]) {
                throw new java.lang.IndexOutOfBoundsException("INDEX_OUT_OF_BOUNDS");
            }
            index += strides[i] * indices[i];
        }
        return index;
    }
    
    public int[] getShape() { return shape; }
    
    public T[] getData() { return (T[]) data; }
    
    /**
     * @param indices an array containing an index for each dimension of the tensor.
     * @return        element of this index.
     */
    public T getItem(int[] indices) { return this.data[dataIndex(indices)]; }
    
    public void setData(T[] data) { this.data = data; }
    
    public Class<T> getType() { return type; }
    
    /**
     * @param indices an array containing an index for each dimension of the tensor.
     * @param number  the item to store in the tensor at the given indices.
     */
    public void setItem(int[] indices, T number){ 
        this.data[dataIndex(indices)] = number; 
    }
    
    
    @Override
    public String toString(){
        if(size == 1){
            return "[["+data[0]+"]]";
        }
        
        String str = "[";
        String[] nums = new String[data.length];
        
        for (int i = 0; i < data.length; i++){
            nums[i] = data[i].toString();
        }
        
        int pos = shape.length - 1;
        int p = 1;
        for (int j = pos; j > 0; j--){
            p *= shape[j]; 
            for (int i = 0; i < nums.length; i++){
                if (p == 1){
                    nums[i] = "[" + nums[i] + "]";
                } else{
                    if (i % p == 0){
                        nums[i] = "[" + nums[i];
                    } else if (i % p == p - 1){
                        nums[i] = nums[i] + "]";
                    }
                }
            }
        }
       
        for (int i = 0; i < nums.length; i++){
            int max_m = (int) nums[0].chars().filter(ch -> ch =='[').count();
            int n = (int) nums[i].chars().filter(ch -> ch ==']').count();
            int m = (int) nums[i].chars().filter(ch -> ch =='[').count();
            
            if (m > 0 && m < max_m){
                str += String.join("", Collections.nCopies(max_m - m + 1, " "));
            }
            if (n > 0){
                if (n > 1){
                    str += nums[i] + String.join("", Collections.nCopies(n, "\n"));
                } else if (n == 1){
                    str += nums[i] + "\n";
                }
            } else{
                str += nums[i] + " ";
            }
        }
        
        return str.substring(0, str.length() - shape.length + 1) + "],"
                                                            + " shape=" + Arrays.toString(shape)
                                                            + " dtype=" + type.getSimpleName() + "\n\n";
    }
}
