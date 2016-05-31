package main.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Steven on 31-5-2016.
 */
public class ButtonListVisitor implements IButtonListVisitor {

    @Override
    public void onButton(Button button) {
        System.out.println("Banana");

    }
}
