package chip8

import spock.lang.Specification

class DisassemblerSpec extends Specification {

    def "Clear Screen is printed"() {
        setup:
        def app = new Disassembler()

        when:
        def result = app.cls()

        then:
        result == "0000: CLS"
    }

    def "Return is printed"() {
        setup:
        def app = new Disassembler()

        when:
        def result = app.ret()

        then:
        result == "0000: RET"
    }

   def "SYS is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.sys((byte)0x3E, (byte)0x54)

        then:
        result == "0000: SYS 0E54"
    }

    def "JP_A is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.jp_a((byte)0x13, (byte)0x54)

        then:
        result == "0000: JP 0354"
    }

    def "CALL is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.call((byte)0x23, (byte)0x54)

        then:
        result == "0000: CALL 0354"
    }

    def "SE is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.se_xb((byte)0x3E, (byte)0x54)

        then:
        result == "0000: SE VE, 54"
    }

    def "DRW is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.drw((byte)0xDE, (byte)0x54)

        then:
        result == "0000: DRW VE, V5, 4"
    }

    def "SNE is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.sne_xb((byte)0x4E, (byte)0x54)

        then:
        result == "0000: SNE VE, 54"
    }
    
    def "SE is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.se_xy((byte)0x5E, (byte)0x54)

        then:
        result == "0000: SE VE, V5"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_xb((byte)0x6E, (byte)0x54)

        then:
        result == "0000: LD VE, 54"
    }

    def "ADD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.add_xb((byte)0x7E, (byte)0x54)

        then:
        result == "0000: ADD VE, 54"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_xy((byte)0x8E, (byte)0x54)

        then:
        result == "0000: LD_XY VE, V5"
    }

    def "OR is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.or((byte)0x8E, (byte)0x54)

        then:
        result == "0000: OR VE, V5"
    }

    def "AND is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.and((byte)0x8E, (byte)0x54)

        then:
        result == "0000: AND VE, V5"
    }

    def "XOR is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.xor((byte)0x8E, (byte)0x54)

        then:
        result == "0000: XOR VE, V5"
    }

    def "ADD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.add_xy((byte)0x8E, (byte)0x54)

        then:
        result == "0000: ADD_2 VE, V5"
    }

    def "SUB is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.sub_xy((byte)0x8E, (byte)0x54)

        then:
        result == "0000: SUB VE, V5"
    }

    def "SHR is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.shr((byte)0x8E, (byte)0x54)

        then:
        result == "0000: SHR VE, V5"
    }

    def "SUBN is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.subn((byte)0x8E, (byte)0x54)

        then:
        result == "0000: SUBN VE, V5"
    }

    def "SHL is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.shl((byte)0x8E, (byte)0x54)

        then:
        result == "0000: SHL VE, V5"
    }

    def "SNE is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.sne_xy((byte)0x9E, (byte)0x54)

        then:
        result == "0000: SNE VE, V5"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_i((byte)0xAE, (byte)0x54)

        then:
        result == "0000: LD I"
    }

    def "JP is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.jp_0a((byte)0xBE, (byte)0x54)

        then:
        result == "0000: JP V0, 0E54"
    }

    def "RND is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.rnd((byte)0xCE, (byte)0x54)

        then:
        result == "0000: RND VE, 54"
    }

    def "SKP is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.skp((byte)0xEE, (byte)0x54)

        then:
        result == "0000: SKP VE"
    }

    def "SKNP is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.sknp((byte)0xEE, (byte)0x54)

        then:
        result == "0000: SKNP VE"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_xdt((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD VE, DT"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_xk((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD VE, K"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_dtx((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD DT, VE"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_stx((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD ST, VE"
    }

    def "ADD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.add_ix((byte)0xFE, (byte)0x54)

        then:
        result == "0000: ADD I, VE"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_fx((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD F, VE"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_bx((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD B, VE"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_iix((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD [I], VE"
    }

    def "LD is decoded"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ld_xii((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD VE, [I]"
    }

}