/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chip8;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static short pc = 512;
    public String getGreeting() {
        return "Hello world.";
    }

    public static void loadFile(byte[] ans) throws FileNotFoundException, IOException{
            int current;
            int c = 0;

            
        Disassembler dsssmblr = new Disassembler();
        String answers = "";

        for(int i = 0; i < ans.length; i = i + 2,pc = (short)(pc + 2)){

            var hexVal = (ans[i] >>> 4) & 0x0F;

            switch(hexVal){
                
                case (byte)0x01:
                    answers = answers + String.format("%04X: ", pc) + dsssmblr.jp_a(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x02:
                    answers = answers + String.format("%04X: ", pc) + dsssmblr.call(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x03:
                    answers = answers + String.format("%04X: ", pc) + dsssmblr.se_xb(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x04:
                    answers = answers + String.format("%04X: ", pc) + dsssmblr.sne_xb(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x05:
                    answers = answers + String.format("%04X: ", pc) + dsssmblr.se_xy(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x06:
                    answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_xb(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x07:
                    answers = answers + String.format("%04X: ", pc) + dsssmblr.add_xb(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x08:
                            var hexVal_2 = ans[i+1] & 0x0F;

                            switch(hexVal_2){

                                case (byte)0x00:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_xy(ans[i], ans[i+1])+"\n";
                                break;

                                case (byte)0x01:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.or(ans[i], ans[i+1])+"\n";
                                break;

                                case (byte)0x02:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.and(ans[i], ans[i+1])+"\n";
                                break;

                                case (byte)0x03:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.xor(ans[i], ans[i+1])+"\n";
                                break;

                                case (byte)0x04:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.add_xy(ans[i], ans[i+1])+"\n";
                                break;

                                case (byte)0x05:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.sub_xy(ans[i], ans[i+1])+"\n";
                                break;

                                case (byte)0x06:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.shr(ans[i], ans[i+1])+"\n";
                                break;

                                case (byte)0x07:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.subn(ans[i], ans[i+1])+"\n";
                                break;

                                case (byte)0x0E:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.shl(ans[i], ans[i+1])+"\n";
                                break;
                            }
                            break;
                case (byte)0x09:
                answers = answers + String.format("%04X: ", pc) + dsssmblr.sne_xy(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x0A:
                answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_i(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x0B:
                answers = answers + String.format("%04X: ", pc) + dsssmblr.jp_0a(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x0C:
                answers = answers + String.format("%04X: ", pc) + dsssmblr.rnd(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x0D:
                answers = answers + String.format("%04X: ", pc) + dsssmblr.drw(ans[i], ans[i+1])+"\n"; 
                break;

                case (byte)0x0E:
                            var hexVal_3 = ans[i+1] & 0x0F;

                            switch(hexVal_3){

                                case (byte)0x0E:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.skp(ans[i], ans[i+1])+"\n"; 
                                break;

                                case (byte)0x01:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.sknp(ans[i], ans[i+1])+"\n"; 
                                break;

                            }
                    break;

                case (byte)0x0F:
                            var hexVal_4 = ans[i+1];

                            switch(hexVal_4){

                                case (byte)0x07:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_xdt(ans[i], ans[i+1])+"\n"; 
                                break;

                                case (byte)0x0A:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_xk(ans[i], ans[i+1])+"\n"; 
                                break;

                                case (byte)0x15:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_dtx(ans[i], ans[i+1])+"\n"; 
                                break;

                                case (byte)0x18:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_stx(ans[i], ans[i+1])+"\n"; 
                                break;

                                case (byte)0x1E:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.add_ix(ans[i], ans[i+1])+"\n"; 
                                break;

                                case (byte)0x29:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_fx(ans[i], ans[i+1])+"\n"; 
                                break;

                                case (byte)0x33:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_bx(ans[i], ans[i+1])+"\n"; 
                                break;

                                case (byte)0x55:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_iix(ans[i], ans[i+1])+"\n"; 
                                break;

                                case (byte)0x65:
                                answers = answers + String.format("%04X: ", pc) + dsssmblr.ld_xii(ans[i], ans[i+1])+"\n"; 
                                break;

                            }
                    break;


            }
        }
    
        System.out.println(answers);

        }

    public static void main(String[] args) {
        
        try{
            byte[] content = Files.readAllBytes(Paths.get("/Users/marygarcia/Downloads/chip8 2/ufo.rom"));
            loadFile(content);
        } catch (Exception e) {
            System.out.println("No se puede");
            e.printStackTrace();
        }
    }
}
