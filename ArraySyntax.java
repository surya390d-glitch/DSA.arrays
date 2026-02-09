class Syntax{
   public static void main(String args[]){
     // datatype [] variable_name = new datatype [size];
                        //or
     // datatype [] variable_name = {store int or "string};
     //for example(int) 
     int [] num = new int[5];// new keyword is used to create an object.
      /*BREAKDOWN THIS STEP
        int [] num; -------> it is a declaration of arrys. num getting defined in stack(THIS THING HAPPENED AT COMPILE TIME)
        num = new int[5] ----------> initialization: actually here object is created in (heap) memory (THIS THING HAPPENED AT RUN TIME)*/
        /////THIS IS KNOW AS DYNAMIC MEMORY ALLOCATION.
     int [] num2 = {1,2,3,4,5,6,7};
     //example for string
     String [] names = {"trump","elon","epstein","hawking"};
     Sysyem.out.println("names: " + names);
   }
}
//1. Array Object Are In Heap
//2. heap objects are not continue but c++ have a continious memory allocation. why?
//3. Dynamic Memory Allocation.
//Hence array object in java may not continue(it's depends on JVM).why?
