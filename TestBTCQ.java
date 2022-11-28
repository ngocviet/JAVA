
package De2_dai;

public class TestBTCQ {
    public static void main(String[] args) {
        // ".": 1 ký tự bất kỳ
        String s1 = "d";
        System.out.println("s1="+s1);
        boolean match = s1.matches(".");
        System.out.println("Match: "+match);
        
        // "*": 0 hoặc nhiều lần
        // "+": 1 hoac nhieu lan
        String s2 = "dddd";
        System.out.println("s2="+s2);
        match = s2.matches("d*");
        System.out.println("Match: "+match);
        
        // "^m": 1 ky tu bat dau` la "m"
        s2 = "v";
        System.out.println("s3="+s2);
        match = s2.matches("^v");
        System.out.println("Match: "+match);
        
        // "p$": 1 ky tu ket thuc la "p"
        s2 = "p";
        System.out.println("s4="+s2);
        match = s2.matches("p$");
        System.out.println("Match: "+match);
        
        // "n{1,3}": ký tự n xuất hiện 1 hoặc tối đa 3 lần
        // "[xyz]" : ký tự là "x" hoặc "y" hoặc "z"
        s2 = "23ddasav";
        System.out.println("s5="+s2);
        match = s2.matches(".+[abc][bv]");
        System.out.println("Match: "+match);
        
        // [^abc]: ky tu bat ky ngoai tru "a" "b" "c"
        s2 = "g";
        System.out.println("s6="+s2);
        match = s2.matches("[^abc]");
        System.out.println("Match: "+match);
        
        // \d: So bat ky ~ [0-9]
        // \D: ky tu khong phai so ~ [^0-9]
        // \s: Ky tu khoang trang ~ [\t\n\x0b\r\f]
        // \S: Ky tu khac khoang trang ~ [^\s]
        // \w: Ky tu chữ ~ [a-zA-Z_0-9]
        // \w: Ký tự không phải chữ
        // *: xuất hiện 0 hoặc nhiều lần
        // +: xuất hiện 1 hoặc nhiều lần
        // ?: xuất hiện 0 hoặc 1 lần
        // {X}: Xuất hiện X lần
    }
}
