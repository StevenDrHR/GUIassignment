package main.main;

/**
 * Created by Willem on 2-6-2016.
 */
public class Label implements ILabel {

    @Override
    public void visit(IAssetListVisitor Visitor) {
        Visitor.onLabel(this);
    }
}
