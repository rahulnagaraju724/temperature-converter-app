/*
--------------------------------------------------------------------
- Author Rahul Nagaraju
- Assignment: Lab1
- FileName: MainActivity.java
- Course: ITMD-555 Intelligent Device Applications
- Instructor: James Papademas
----------------------------------------------------------------------
*/

package com.example.tempconverter;

// Importing necessary classes from the Android framework
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * The MainActivity.java file serves as the central component of an Android application
 * dedicated to temperature conversion between Celsius and Fahrenheit.
 *
 * It employs various user interface elements like EditText for accepting temperature input,
 * RadioButtons for selecting temperature units, and ImageView for presenting temperature-related visual cues.
 *
 * The program's core functionalities involve:
 * - Processing user-provided temperature values and ensuring their validity.
 * - Executing temperature conversions between Celsius and Fahrenheit through a utility class (ConverterUtil).
 * - Dynamically updating the user interface to reflect converted temperature values,
 *   including altering the layout's background color and displaying relevant images
 *   (such as a sun or frost) within an ImageView.
 * - Providing users with informative feedback via Toast messages to validate their inputs.
 *
 * In summary, the MainActivity orchestrates temperature conversion operations while delivering
 * an engaging user experience that visually communicates temperature ranges through color changes and imagery.
 */


// MainActivity class declaration, extending AppCompatActivity
public class MainActivity extends AppCompatActivity {

    // Declaration of variables
    private EditText text; // EditText for user input
    ImageView iv; // ImageView to display images
    View view; // View to manipulate background color

    // onCreate method called when the activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Setting the layout
        text = findViewById(R.id.editTextNumberDecimal2); // Initializing EditText
    }

    // onClick method called when a button is clicked
    // (assigned in the XML layout file using the android:onClick attribute)
    public void onClick(View view) {
        if (view.getId() == R.id.button) { // Check if the clicked view is the button

            // Retrieving references to the radio buttons
            RadioButton celsiusButton = findViewById(R.id.radioButton);
            RadioButton fahrenheitButton = findViewById(R.id.radioButton2);

            // Validating user input
            if (text.getText().length() == 0) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
                return;
            }

            // Parsing user input to float
            float inputValue = Float.parseFloat(text.getText().toString());

            // Checking which radio button is checked and performing temperature conversion
            if (celsiusButton.isChecked()) {
                text.setText(String.valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue)));
                celsiusButton.setChecked(false);
                fahrenheitButton.setChecked(true);
            } else {
                text.setText(String.valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue)));
                fahrenheitButton.setChecked(false);
                celsiusButton.setChecked(true);
                inputValue = (float) ConverterUtil.convertCelsiusToFahrenheit(inputValue); // Update input value
            }

            // Setting background color and image based on temperature value
            view = findViewById(R.id.activity_main); // Getting the main layout view
            iv = findViewById(R.id.imageView3); // Initializing ImageView

            if (inputValue > 90) { // If temperature is above 90
                // Set background color to sky blue and display sun image
                view.setBackgroundColor(Color.parseColor("#87ceff"));
                iv.setVisibility(View.VISIBLE); // Show ImageView
                //clear any prior image
                ((ImageView) iv.findViewById(R.id.imageView3)).setImageResource(0);
                iv.setImageResource(R.drawable.sun); // Set sun image
            } else if (inputValue < 90 && inputValue > 0) { // If temperature is between 0 and 90
                // Set background color to yellow and hide ImageView
                view.setBackgroundColor(Color.YELLOW);
                iv.setVisibility(View.GONE); // Hide ImageView
            } else { // If temperature is below 0
                // Set background color to red and display frost image
                view.setBackgroundColor(Color.RED);
                iv.setVisibility(View.VISIBLE); // Show ImageView
                ((ImageView) iv.findViewById(R.id.imageView3)).setImageResource(0);
                iv.setImageResource(R.drawable.frosty); // Set frost image
            }
        }
    }
} // End of MainActivity class
