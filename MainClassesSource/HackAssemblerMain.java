import AssemblerGUI.AssemblerComponent;
import Hack.Assembler.HackAssembler;
import Hack.Assembler.HackAssemblerGUI;
import Hack.Translators.HackTranslatorException;
import javax.swing.UIManager;

public class HackAssemblerMain {
    public static void main(String[] paramArrayOfString) {
        if (paramArrayOfString.length > 1) {
            System.err.println("Usage: java HackAssembler [.asm name]");
            System.exit(-1);
        }
        if (paramArrayOfString.length == 1) {
            try {
                HackAssembler hackAssembler = new HackAssembler(paramArrayOfString[0], 32768, (short)0, true);
            } catch (HackTranslatorException hackTranslatorException) {
                System.err.println(hackTranslatorException.getMessage());
            }
        } else {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Exception exception) {}
            try {
                AssemblerComponent assemblerComponent = new AssemblerComponent();
                assemblerComponent.setAboutFileName("bin/help/asmAbout.html");
                assemblerComponent.setUsageFileName("bin/help/asmUsage.html");
                HackAssembler hackAssembler = new HackAssembler((HackAssemblerGUI)assemblerComponent, 32768, (short)0, null);
            } catch (HackTranslatorException hackTranslatorException) {
                System.err.println(hackTranslatorException.getMessage());
                System.exit(-1);
            }
        }
    }
}
