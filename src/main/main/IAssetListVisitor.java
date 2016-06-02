package main.main;

import javafx.scene.control.Label;

/**
 * Created by Willem on 2-6-2016.
 */

public interface IAssetListVisitor {
    void onButton(Button button);

    void onLabel(Label label);
}
