package uz.inha.muhammad.coffeetable;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int numCoffeeOrdered;
    int COFFEE_PRICE = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numCoffeeOrdered = 0;
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayPrice(numCoffeeOrdered*COFFEE_PRICE);
    }
    public void increaseQuantity(View view){
        if (numCoffeeOrdered != 10) {
            numCoffeeOrdered++;
        }
        display(numCoffeeOrdered);
        //not finished
    }

    public void decreaseQuantity(View view){
        if (numCoffeeOrdered != 0){
            numCoffeeOrdered--;
        }
        display(numCoffeeOrdered);
        //not finished
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_number);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}