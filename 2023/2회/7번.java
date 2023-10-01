//다음은 자바에 대한 문제이다. 알맞은 출력값을 작성하시오.
public class Main{
    public static void main(String[] args) {
        
        String str1 = ‘Programming’;
        String str2 = ‘Programming’;
        String str3 = new String(‘Programming’);
        
        println(str1==str2)
        println(str1==str3)
        println(str1.equals(str3))
        print(str2.equals(str3))
    }
}

//답
//true
//false
//true
//true
