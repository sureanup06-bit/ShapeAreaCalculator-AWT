# Shape Area Calculator

A simple and interactive **Java AWT-based GUI application** that calculates the area of different geometric shapes. The user can select a shape, enter the required dimensions, and get the calculated area instantly.

## Project Overview

**Shape Area Calculator** is designed to demonstrate the use of **Java AWT, GUI components, event handling, mathematical calculations, and exception handling** in a practical application.

The project supports **10 different geometric shapes** and provides a separate calculation interface according to the selected shape. It also includes basic input validation to handle invalid and zero values.

## Shapes Supported

The calculator supports **10 shapes**:

* Circle
* Square
* Rectangle
* Triangle
* Parallelogram
* Rhombus
* Trapezium
* Kite
* Ellipse
* Hexagon

## Formulas Used

| Shape         | Formula                                    |
| ------------- | ------------------------------------------ |
| Circle        | `22/7 × r²`                                |
| Square        | `side²`                                    |
| Rectangle     | `length × breadth`                         |
| Triangle      | `(length × breadth) / 2`                   |
| Parallelogram | `height × breadth`                         |
| Rhombus       | `height × base`                            |
| Trapezium     | `((side₁ + side₂) × height) / 2`           |
| Kite          | `(diagonal₁ × diagonal₂) / 2`              |
| Ellipse       | `22/7 × semi-major axis × semi-minor axis` |
| Hexagon       | `(3 × 1.73 / 2) × side²`                   |

## Features

* Simple Java AWT graphical interface
* Supports 10 geometric shapes
* Shape selection through a dropdown menu
* Individual input fields based on the selected shape
* Instant area calculation
* Clear button to reset input fields
* Home button to return to the main menu
* Basic input validation
* Exception handling for invalid numeric input
* Error messages for invalid and zero values

## Error Handling

The application handles common invalid inputs using exception handling.

### Invalid Input

If a non-numeric or otherwise invalid value is entered:

`Error : Invalid input`

### Zero Value

If a required length is entered as zero:

`Error : Length cannot be zero`

For trapezium height:

`Error : Height cannot be zero`

## Technologies Used

* **Java**
* **Java AWT**
* **Event Handling**
* **Exception Handling**

### AWT Components

* `Frame`
* `Label`
* `Button`
* `Choice`
* `TextField`

### Event Handling

* `ActionListener`
* `ActionEvent`

## How It Works

1. Launch the application.
2. Select a shape from the dropdown menu.
3. Click **Select** to display the selected shape.
4. Click **Calculate** to open the calculation window.
5. Enter the required dimensions.
6. Click **Calculate** to display the area.
7. Use **Clear** to reset the entered values.
8. Use **Home** to return to the main menu.

## Project Structure

```text
ShapeAreaCalculator_AWT/
│
└── ShapeAreaCalculator_AWT.java
```

## How to Run

### Compile

```bash
javac ShapeAreaCalculator_AWT.java
```

### Run

```bash
java ShapeAreaCalculator_AWT
```

## Learning Outcomes

This project helped in understanding and practicing:

* Java AWT GUI development
* Creating and managing GUI components
* Event-driven programming
* `ActionListener` and `ActionEvent`
* `switch-case` statements
* User input through `TextField`
* Mathematical calculations
* Basic input validation
* Exception handling using `try-catch`
* Working with multiple GUI windows

## Future Improvements

* Improve the overall GUI design
* Add more geometric shapes
* Improve input validation
* Improve calculation precision
* Reduce code repetition using reusable methods
* Add a more modern graphical interface

## Author

**Anup Sure**

---

**Project Status:** Completed
