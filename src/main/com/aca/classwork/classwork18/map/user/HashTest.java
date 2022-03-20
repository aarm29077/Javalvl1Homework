package com.aca.classwork.classwork18.map.user;

public class HashTest {

    private int a;
    private int b;
    private int c;

    public HashTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    @Override
//    public int hashCode() {


/*
integeri hashcody havasar e et nuyn integerin.

Ete uzumenq imananq inchia havasar hashcody, grum enq Integer.hashcody(...) gnumenq codi mej, tesnumenq inchia havasar

long i depqum Long.hashCode(), short i depqum Short.hashCode()

qani vor hashCode y int a, longy,shorty cast kani int

string i depqum grumenq String.hashCode(), charerov hashvuma, veradarcnuma int


ete erku hat popoxakan ka, mi hat popoxakan enq vercnum vory havasaracnum enq arajin fieldin, resulty bazmapatkum enq parz tvov, u gumarumenq hajord fieldy

Object a;
long b;
Object c;

int result = a.hashCode();
result = 31 * result+Long.hashCode(b);
result = 31 * result + c.hashCode();
return result;

kam es amboxji texy grenq Objects.hash(a,b,c);
*/

//        Integer.hashCode();
//
//    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
