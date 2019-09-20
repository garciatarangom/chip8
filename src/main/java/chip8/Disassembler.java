package chip8;

public class Disassembler {
    

    public String pcAddr(byte msb, byte lsb) {
        return String.format("%02X%02X: ", msb, lsb);
    }

    public String cls(byte msb, byte lsb) {
        return "CLS";
    }

    public String ret(byte msb, byte lsb){
        return "RET";
    }

    public String sys(byte msb, byte lsb) {
        var addr = msb & 0x0F;
        return String.format("SYS %02X%02X",addr, lsb);
    }

    public String jp_a(byte msb, byte lsb) {
        var addr = msb & 0x0F;
        return String.format("JP %02X%02X",addr, lsb);
    }

    public String call(byte msb, byte lsb) {
        var addr = msb & 0x0F;
        return String.format("CALL %02X%02X",addr, lsb);
    }

    public String se_xb(byte msb, byte lsb) {
        var x = msb & 0x0F;
        return String.format("SE V%1X, %02X", x, lsb);
    }

    public String drw(byte msb, byte lsb) {
        var x = msb & 0x0F;
        var n = lsb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("DRW V%1X, V%1X, %1X", x, y, n);
    }

    public String sne_xb(byte msb, byte lsb) {
        var x = msb & 0x0F;
        return String.format("SNE V%1X, %02X", x, lsb);
    }

    public String se_xy(byte msb, byte lsb) {
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SE V%1X, V%1X", x, y);
    }

    public String ld_xb(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, %02X", x, lsb);
    }

    public String add_xb(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("ADD V%1X, %02X", x, lsb);
    }

    public String ld_xy(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("LD V%1X, V%1X", x, y);
    }

    public String or(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("OR V%1X, V%1X", x, y);
    }

    public String and(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("AND V%1X, V%1X", x, y);
    }

    public String xor(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("XOR V%1X, V%1X", x, y);
    }

    public String add_xy(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("ADD_2 V%1X, V%1X", x, y);
    }

    public String sub_xy(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SUB V%1X, V%1X", x, y);
    }

    public String shr(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SHR V%1X, V%1X", x, y);
    }

    public String subn(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SUBN V%1X, V%1X", x, y);
    }

    public String shl(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SHL V%1X, V%1X", x, y);
    }

    public String sne_xy(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SNE V%1X, V%1X", x, y);
    }

    public String ld_i(byte msb, byte lsb){
        var addr = msb & 0x0F;
        return String.format("LD I, %02X%02X: ", addr,lsb);
    }

    public String jp_0a(byte msb, byte lsb){
        var addr = msb & 0x0F;
        return String.format("JP V0, %04X", addr,lsb);
    }

    public String rnd(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("RND V%1X, %02X", x, lsb);
    }

    public String skp(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("SKP V%1X", x);
    }

    public String sknp(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("SKNP V%1X", x);
    }

    public String ld_xdt(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, DT", x);
    }

    public String ld_xk(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, K", x);
    }

    public String ld_dtx(byte msb, byte lsb){
        var x = msb & 0x0F;
        return  String.format("LD DT, V%1X", x);
    }

    public String ld_stx(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD ST, V%1X", x);
    }

    public String add_ix(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("ADD I, V%1X", x);
    }

    public String ld_fx(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD F, V%1X", x);
    }

    public String ld_bx(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD B, V%1X", x);
    }

    public String ld_iix(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD [I], V%1X", x);
    }

    public String ld_xii(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, [I]", x);
    }
}