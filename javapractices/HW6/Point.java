package org.javapractices.HW6;

public class Point {
    // x = x0 + vx*t + ax * t^2 / 2 and similarly for other coordinates
    double[] coord = new double[3]; // initial coordinates
    double[] v =  new double[3]; // initial velocity projected on the coordinate axes 
    double[] a =  new double[3]; // acceleration projected on the coordinate axes 
    double t; //t0 = 0
    
    Point(double[] coord, double[] v, double[] a, double t){
        this.coord = coord;
        this.v = v;
        this.a = a;
        this.t = t;
    }
    
    public double[] getCoordinates(double tt){
        double[] new_coord = new double[3];
        for (int i = 0; i < 3; i++)
            new_coord[i] = coord[i] + v[i]*tt + a[i]*Math.pow(tt, 2) / 2;
        return new_coord;
    }
    
    public double[] getVelocity(double tt){
        double[] new_v = new double[3];
        for (int i = 0; i < 3; i++)
            new_v[i] = v[i] + a[i]*tt;
        return new_v;
    }
    
    // return time t when the points overlaps. Otherwise it returns -1
    public double areIntersect(Point b){
        Point a = this;
        double[] time = new double[2];
        
        // find the time when the points overlap
        double s = 2*(b.v[0] - a.v[0]);
        double D = Math.pow(s, 2) - 8 * (b.a[0] - a.a[0]) * (b.coord[0] - a.coord[0]);
        if (D > 0){
            time[0] = (-s + Math.sqrt(D)) / (2 * (b.a[0] - a.a[0]));
            time[1] = (-s - Math.sqrt(D)) / (2 * (b.a[0] - a.a[0]));
        }
        if (Math.abs(D) < 10e-4){
            time[0] = -s / (2 * (b.a[0] - a.a[0]));
            time[1] = -1;
        }
        else
            return -1;
        
        // check whether the time is correct for solving the equation in y and z coordinates
        if (time[1] > 0){
            if (Math.abs(getCoord(b, time[0], 1) - getCoord(a, time[0], 2)) < 10e-4){
                if (Math.abs(getCoord(b, time[0], 2) - getCoord(a, time[0], 2)) < 10e-4)
                    return time[0];
            }
            else if (Math.abs(getCoord(b, time[1], 1) - getCoord(a, time[1], 1)) < 10e-4){
                if (Math.abs(getCoord(b, time[1], 2) - getCoord(a, time[1], 2)) < 10e-4)
                    return time[1];
            }
        }
        else{
            if (Math.abs(getCoord(a, time[1], 1) - getCoord(b, time[1], 1)) < 10e-4){
                if (Math.abs(getCoord(a, time[1], 2) - getCoord(a, time[1], 2)) < 10e-4)
                    return time[1];
            }
        }
        return -1;
    }
    
    private double getCoord(Point a, double time, int i){
        return a.coord[i] + a.v[i]*time + a.a[i] * Math.pow(time, 2) / 2;
    }
    
    public double findDistance(Point b, double time){
        Point a = this;
        double x1 = getCoord(a, time, 0);
        double y1 = getCoord(a, time, 1);
        double z1 = getCoord(a, time, 2);
        double x2 = getCoord(b, time, 0);
        double y2 = getCoord(b, time, 1);
        double z2 = getCoord(b, time, 2);
        
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) + Math.pow(z2-z1, 2));
        
        
    }
}
