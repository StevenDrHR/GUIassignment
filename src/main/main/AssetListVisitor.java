package main.main;

import javafx.scene.control.Label;

/**
 * Created by Willem on 2-6-2016.
 */
public class AssetListVisitor implements IAssetListVisitor{


    @Override
    public void onButton(Button button) {
        System.out.println("Banana Button");
    }

    @Override
    public void onLabel(Label label) {
        System.out.println("Banana Label");

    }
}
