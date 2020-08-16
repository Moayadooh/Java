package com.moayad.oop.marker_interface;

interface Shape {
    double getArea();
    double getCircumference();
}

interface DeletableShape extends Shape {
}

class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return 2 * (width + height);
    }
}

class ShapeDao {

    public boolean delete(Object object) {
        if (!(object instanceof DeletableShape)) {
            return false;
        }
        // Calling the code that deletes the entity from the database

        return true;
    }

}
