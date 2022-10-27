package de.bht.pr2.lab01;

public class Student {

  //-------------------------------------------
  // Attribute
  private String name = "";

  // Matrikelnummer
  private int registrationNumber = 0;

  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  private String courseOfStudies = "";

  // Rückmeldegebühr
  public static final int TUITION_FEE = 312;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */ 

  public Student(String dataRow)  {
    // TODO: Here goes your code ...

    // define the exceptions Object(String)


    // extract all attributes from the dataRow
    // and throw an exception if the data is not valid

    // Hint: use the split method of the String class
    // to extract the attributes from the dataRow, we use the comma as separator
    String[] attributes = dataRow.split(",");

    // iterate over the attributes and check if they are valid
    for (int i = 0; i < attributes.length; i++) {
      try{
      // check if the name is valid
      if (i == 0) {
        // check if the name is valid
        if (attributes[i].length() < 2) {
          // throw an exception if the name is not valid
          throw new StudentParseException("The name is not valid");
        } else {
          // set the name
          this.name = attributes[i];
        }
      }

      // check if the registration number is valid
      if (i == 1) {
        // check if the registration number is valid
        if (attributes[i].length() != 6) {
          // throw an exception if the registration number is not valid
          throw new StudentParseException("The registration number is not valid");
        } else {
          // set the registration number
          this.registrationNumber = Integer.parseInt(attributes[i]);
        }
      }

      // check if the course of studies is valid
      if (i == 2) {
        // check if the course of studies is valid
        if (attributes[i].equals("Medieninformatik") || attributes[i].equals("Technische Informatik") || attributes[i].equals("Druck- und Medientechnik") || attributes[i].equals("Screen Based Media")) {
          // set the course of studies
          this.courseOfStudies = attributes[i];
        } else {
          // throw an exception if the course of studies is not valid
          throw new StudentParseException("The course of studies is not valid");
        }
      }
    } catch (StudentParseException e) {
    System.out.println(e.getMessage());
  }


    // try{
    //   // check if the name is valid
    //   if(attributes[0].length() < 2){
    //     throw new StudentParseException("Name is too short");
    //   }
    //   else{
    //     this.name = attributes[0];
    //   }

    //   // check if the registration number is valid
    //   if(attributes[1].length() != 6){
    //     throw new StudentParseException("Registration number is too short or too long");
    //   }
    //   else{
    //     this.registrationNumber = Integer.parseInt(attributes[1]);
    //   }

    //   // check if the course of studies is valid
    //   if(attributes[2].equals("Medieninformatik") || attributes[2].equals("Technische Informatik") || attributes[2].equals("Druck- und Medientechnik") || attributes[2].equals("Screen Based Media")){
    //     this.courseOfStudies = attributes[2];
    //   }
    //   else{
    //     throw new StudentParseException("Course of studies is not valid");
    //   }
    // }
    // catch(StudentParseException e){
    //   System.out.println(e.getMessage());
    // }





    // for (int i = 0; i < attributes.length; i++) {
    //   // check if the attribute is empty
    //   if (attributes[i].isEmpty()) {

    //   }
    //   System.out.println("attribute: "+attributes[i]);
    // }
    //
  }
}
}
