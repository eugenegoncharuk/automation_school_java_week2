package edu.ctco.school.exercise5;

/**
 * Why we are able to see protected variable i from class X ? --- protected can be visiable in package, it is the reasson
 *
 * What will be printed out, then fixed ? ---
 * 1221
 * 1221
 */
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new X();

        System.out.println(x.i);

        x.methodOfX();
    }
}