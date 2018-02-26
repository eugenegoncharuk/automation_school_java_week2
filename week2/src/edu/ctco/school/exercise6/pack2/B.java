package edu.ctco.school.exercise6.pack2;

import edu.ctco.school.exercise6.pack1.A;

/**
 * Why we can't instantiate class A, even it has public constructor ? -- class was not public, by default classes are visiable insize package
 *
 * How to fix it ? -- was fixed
 */
class B
{
    A a = new A();       //Compile Time Error
}
