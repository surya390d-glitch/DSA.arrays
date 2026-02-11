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
     int [] num2 = {1,2,3,4,5,6,7}; //---------> java internal syntax
     //example for string
     String [] names = {"trump","elon","epstein","hawking"};
     Sysyem.out.println("names: " + names);
   }
}
//1. Array Object Are In Heap
//2. heap objects are not continue but c++ have a continious memory allocation. why?
//3. Dynamic Memory Allocation.
//Hence array object in java may not continue(it's depends on JVM).why?

//PRIMITIVE AND NON-PRIMITIVE
//PRIMITIVE :
   //----> something be can't broken down(int,float,double,char,short)
   //----> something can be broken down (like arrays,string and bigger complex data types can be broken down)

/*NOTE:-----> Objects are stored in Heap memory and Reference Variables Are Stred In Stack Memory
               Each Purticular Element Of An Array it would be located in other memory*/
              
