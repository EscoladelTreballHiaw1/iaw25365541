/*
 * Triangle.java        0.1 04/03/2016
 *
 * Modelizes the program.
 *
 * Copyright 2016 Roger Bagué Martí <rogerbaguemarti@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Triangle {
    
    /** The first side of the triangle. */
    private double side1;
    /** The second side of the triangle. */
    private double side2;
    /** The third side of the triangle. */
    private double side3;
    
    //Constructors
    
    /**
     * Constructor by default.
     */
    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }
    
    /**
     * Constructor.
     * 
     * @param a The first side of the triangle.
     * @param b The second side of the triangle.
     * @param c The third side of the triangle.
     */
    public Triangle(double a, double b, double c) {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }
    
    //Methods
    
    /**
     * Method to calculate the triangle's perimeter.
     */
    public double perimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;
        return perimeter;
    }
    
    /**
     * Method to calculate the triangle's area.
     */
    public double area() {
        double area = Math.pow((Math.pow(side1,2) + Math.pow(side2,2) + Math.pow(side3,2)),2);
        area -= (2 * (Math.pow(side1,4) + Math.pow(side2,4) + Math.pow(side3,4)));
        area = Math.sqrt(area);
        area = area / 4;
        return area;
    }
}