## 一、作为方法参数传递lambda表达式或lambda块
参考:https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm

1、是一种常见用途，将lambda表达式或者lambda块作为参数传递给方法。
2、前提：方法的参数是一个函数式接口引用。
3、将lambda表达式作为参数传递给方法，是很方便的技巧，尤其是该lambda表达式只用一次。
4、将lambda块作为参数传递给方法，程序会比较笨拙，所以先实现lambda块，再传递函数式接口引用给方法
函数式接口

`interface StringFunc{
String func(String str);
}`
2、以函数式接口为参数的方法
`class StringReverse{
public String reverse(StringFunc sf, String str){
return sf.func(str); 
}
}`
//调用了函数式接口的方法

3、传递lambda表达式
`String begin = "this is a process";
String after;
StringReverse sr = new StringReverse();
after = sr.reverse(str -> str.toUpperCase(), begin);
System.out.println(after);
其中：str -> str.toUpperCase()`
创建了函数式接口的具体实现，并将其引用传递给了方法。

4、传递lambda块
`after = sr.reverse( str -> {
String s = "";
for(int i = str.length()-1; i >=0; i--){
s += str.charAt(i);
}
return s;
}, begin);
System.out.println(after);`
将lambda代码块作为方法的参数，传递给方法。与3同效。但这样编写程序太笨拙，易读性差。所以一般常用：先将lambda块赋值给一个函数式接口变量，载再传递该变量给方法。
StringFunc sf = str -> {
String s = "";
for(int i = str.length()-1; i >=0; i--){
s += str.charAt(i);
}
return s;
};
after = sr.reverse(sf, begin);
System.out.println(after);

