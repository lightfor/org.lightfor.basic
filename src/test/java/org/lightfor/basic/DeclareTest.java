package org.lightfor.basic;

/**
 * declare test
 * Created by Light on 2017/8/18.
 */
public class DeclareTest {

    public void test(){
        int _a;
        int $a;
        //error, number start
        //int 1a;


        //error, keywords
        //int void;



    }

    public void test1(){
        class A {
            void a(){

            }

            //error, same method name and parameter signature（number, order and type）
            //ambiguous when call a();
/*            int a(){

            }*/

            void a(int i, float f){

            }

            void a(float f, int i){

            }

            void a(int i){

            }

            void a(float f){

            }
        }
        A a = new A();
        a.a(9.0f,5);
        //error, ambiguous
        //a.a(9,5);
        a.a(9);

    }
}
