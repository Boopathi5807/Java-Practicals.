package operators;

public class Assignment {

	public static void main(String[] args) {

		int X = 12, Y = 13, Z = 16;
		System.out.println("The Assignment Value is:");
		X += 2; // (X=X+2)
		Y -= 2; // (Y=Y-2)
		Z *= 2; // (Z=Z*2)
		System.out.println("The Value f X is:" + X); // 14
		System.out.println("The Value f Y is:" + Y); // 11
		System.out.println("The Value f Z is:" + Z); // 32

	}
}

//                          -----------...---------

//     Shorthand assignment operator:

//              Operator              Usage             Effect
//              +=                  a+=b;             a=a+b;
//              -=                  a-=b;             a=a-b;
//              *=                  a*=b;             a=a*b;
//              /=                  a/=b;             a=a/b;
//              %=                  a%=b;             a=a%b;
//              &=                  a&=b;             a=a&b;
//              |=                  a|=b;             a=a|b;
//              ^=                  a^=b;             a=a^b;
//              <<=                 a<<=b;            a=a<<b;
//              >>=                 a>>=b;            a=a>>b;
//              >>>=                a>>>=b;           a=a>>>b;