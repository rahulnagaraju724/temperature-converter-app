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

### Snapshots

Snapshot 1: - 40 Degree Celsius to Fahrenheit

![1](https://github.com/rahulnagaraju724/Android-Studio/assets/143856412/45d98a53-9b95-4321-ad5c-aa2628da19e3)

![2](https://github.com/rahulnagaraju724/Android-Studio/assets/143856412/be2fd37d-3697-43fc-8968-9f2faa0dc357)



Snapshot 2: Temp > 90 F. Set Blue Background and Sun Image.

![3](https://github.com/rahulnagaraju724/Android-Studio/assets/143856412/fd10ef2e-6c8e-4ea8-899d-cca98c12d1a0)


![4](https://github.com/rahulnagaraju724/Android-Studio/assets/143856412/b158a9d1-152b-4eed-ac12-059c5e925964)



Snapshot 3: Temp < 90F i.e., 86 F to C. Set Yellow Background, but no Image
  
![5](https://github.com/rahulnagaraju724/Android-Studio/assets/143856412/e3bea266-c43b-446b-8e26-99867d8660a5)

![6](https://github.com/rahulnagaraju724/Android-Studio/assets/143856412/58493e1a-353c-4826-a12c-f558f71398bb)



Snapshot 4 : Temp < 0 F -> Red Background and Frosty Image


![7](https://github.com/rahulnagaraju724/Android-Studio/assets/143856412/5de9e0cf-f67a-48b2-8558-b95f6c3c1616)

![8](https://github.com/rahulnagaraju724/Android-Studio/assets/143856412/0dd4eab2-e970-467f-97d4-6d7455a9d0df)


Snapshot 5: Icon for the App in Home Screen


![11](https://github.com/rahulnagaraju724/Android-Studio/assets/143856412/fd3cd0fe-3c97-40d5-83bf-b0738dd9c974)



Snapshot 6: Design for Activity_Main XML


![Screenshot 2024-02-03 at 10 32 32 PM](https://github.com/rahulnagaraju724/Android-Studio/assets/143856412/3174b4b3-4b46-443d-a98c-cf812db3addb)


For more details about the implementation and usage of the TempConverter application, refer to the source code and documentation.

