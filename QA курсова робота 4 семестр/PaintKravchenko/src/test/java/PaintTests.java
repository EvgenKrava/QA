import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.netbeans.jemmy.QueueTool;
import org.netbeans.jemmy.operators.*;
import static org.junit.Assert.assertEquals;
public class PaintTests {
    JFrameOperator mainFrame;
    @Before
    public void getFrame() {
        DrawFrame.startApp();
        mainFrame = new JFrameOperator();
        new QueueTool().waitEmpty(200);
    }
    @Test
    public void testTitleFrame() {
        String titleFrame = mainFrame.getTitle();
        assertEquals("Paint", titleFrame);
        new QueueTool().waitEmpty(100);
    }
    @Test
    public void testNewButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "New");
        buttonOperator.push();
        JFrameOperator frameOperator = new JFrameOperator("New");
        assertEquals("New", frameOperator.getTitle());
        new JButtonOperator(frameOperator,"Cancel").push();
        new QueueTool().waitEmpty(100);
    }
    @Test
    public void testOpenButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Open");
        buttonOperator.push();
        JFileChooserOperator fileChooserOperator = new JFileChooserOperator();
        JButtonOperator openOperator = new JButtonOperator(fileChooserOperator, "Open");
        assertEquals("Open", openOperator.getText());
        fileChooserOperator.cancel();
    }
    @Test
    public void testSaveButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Save");
        buttonOperator.push();
        JFileChooserOperator fileChooserOperator  = new JFileChooserOperator();
        JTextFieldOperator textFieldOperator = new JTextFieldOperator(fileChooserOperator);
        textFieldOperator.setText("test");
        JButtonOperator jButtonOperator = new JButtonOperator(fileChooserOperator, "Save");
        jButtonOperator.push();
        Assert.assertNotNull(buttonOperator);
    }
    @Test
    public void testPencilButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Pencil");
        Assert.assertNotNull(buttonOperator);
        Assert.assertNotNull(buttonOperator.getIcon());
    }
    @Test
    public void testLineButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Line");
        Assert.assertNotNull(buttonOperator);
        Assert.assertNotNull(buttonOperator.getIcon());
    }
    @Test
    public void testRectangleButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Rectangle");
        Assert.assertNotNull(buttonOperator);
        Assert.assertNotNull(buttonOperator.getIcon());
    }
    @Test
    public void testTextButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Text");
        Assert.assertNotNull(buttonOperator);
        Assert.assertNotNull(buttonOperator.getIcon());
    }
    @Test
    public void testEraseButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Erase");
        Assert.assertNotNull(buttonOperator);
        Assert.assertNotNull(buttonOperator.getIcon());
    }

    @Test
    public void testClearButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Clear");
        Assert.assertNotNull(buttonOperator);
        Assert.assertNotNull(buttonOperator.getIcon());
    }

    @Test
    public void testUndoButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Undo");
        Assert.assertNotNull(buttonOperator);
        Assert.assertNotNull(buttonOperator.getIcon());
    }

    @Test
    public void testRedoButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Redo");
        Assert.assertNotNull(buttonOperator);
        Assert.assertNotNull(buttonOperator.getIcon());
    }

    @Test
    public void testEditColorButton() {
        JButtonOperator buttonOperator = new JButtonOperator(mainFrame, "Edit Color");
        Assert.assertNotNull(buttonOperator);
    }

}
