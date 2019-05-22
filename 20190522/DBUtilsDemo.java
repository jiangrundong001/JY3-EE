package com.neuedu.apache;

import org.apache.commons.dbutils.QueryRunner;


public class DBUtilsDemo {


    public static void main(String[] args) {
        QueryRunner queryRunner = new QueryRunner();
        new DBUtilsDemo().test(1,2,3,4,5);

    }

    public void test(Object... args)
    {
      for (Object o: args){
          System.out.println(o);
      }
    }


}


