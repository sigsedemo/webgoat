// https://sig-product-docs.synopsys.com/bundle/coverity-docs/page/checker-ref/checkers/D/divide_by_zero.html

class DivideByZero {
    void testDiv(int a, int b)
    {
        if (a!=0) {
           //Do something
        }
        int y = b / a;
    }
}
