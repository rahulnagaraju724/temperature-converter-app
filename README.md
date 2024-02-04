# TempConverter

TempConverter is an Android application designed to convert temperatures between Celsius and Fahrenheit.

## MainActivity.java

The `MainActivity.java` file represents the main activity of the TempConverter application. It facilitates temperature conversion operations and manages the user interface elements.

### Functionality

- Parses user input for temperature values and validates it.
- Performs temperature conversions between Celsius and Fahrenheit using the `ConverterUtil` utility class.
- Updates the UI dynamically based on the converted temperature value, including changing the background color of the layout and displaying appropriate images (e.g., sun or frost) in an ImageView.
- Provides user feedback through Toast messages for input validation.

### Components Used

- EditText: For user input of temperature values.
- RadioButtons: For selecting temperature units (Celsius or Fahrenheit).
- ImageView: To display temperature-related images indicating temperature ranges.

### Usage

To use the TempConverter application, follow these steps:
1. Enter the temperature value in the provided EditText field.
2. Select the desired temperature unit (Celsius or Fahrenheit) using the RadioButtons.
3. Click the conversion button to convert the temperature.
4. View the converted temperature value and corresponding visual representation on the UI.

### Implementation Details

The temperature conversion logic is implemented in the `ConverterUtil` utility class, which provides methods for converting temperatures between Celsius and Fahrenheit.

### Notes

- The background color of the layout changes dynamically to visually represent temperature ranges:
  - Blue: Indicates temperatures above 90 degrees Fahrenheit.
  - Yellow: Indicates temperatures between 0 and 90 degrees Fahrenheit.
  - Red: Indicates temperatures below 0 degrees Fahrenheit.
- Images (e.g., sun or frost) are displayed in the ImageView based on the temperature range.

For more details about the implementation and usage of the TempConverter application, refer to the source code and documentation.

