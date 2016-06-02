package main.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Steven on 31-5-2016.
 */
public class Button implements IButton {

    @Override
    public void visit(IAssetListVisitor Visitor) {
        Visitor.onButton(this);
    }
}
