# Math-expression-evaluator
Project Type: JavaFX application
Project Description: 
JavaFX application is a GUI application the user interface container having at least a stage and a scene. JavaFX Scene Builder 2.0 has been used to design the interface. The XML code is xml version 1.0 with encoding UTF-8. The Project is written in NetBeans IDE 8.0.2 and VS code editor with Java version 1.8.0_131. 
It has a one interface with some labels, a button and a text field. The text field can take a string. In case of the string is a valid mathematical expression having integer number, the output label executes the simplified evaluated result. 
The application does not crash in case of error or expectations. It shows the type of exception in the result/ output label. 

The interface: (CalculationLab.fxml) 
 
For the expression: (2+3/5)
 ![image](https://user-images.githubusercontent.com/98779204/185796492-b6c19428-9df7-4685-8500-684c4e6ee050.png)

For the expression: (150+25/4+(3*8)/3+85-38)-28*2+(30-15*3)
 ![image](https://user-images.githubusercontent.com/98779204/185796500-573e887f-47a0-420c-9c5b-9903c90f21dc.png)

For expression with mixed character, it can identify and calculate only digit type. For the expression: 2a+3b*5x+3y/5+9/3+6*8
![image](https://user-images.githubusercontent.com/98779204/185796526-2a8d4a35-be5c-4c1d-8c51-550c8ce530eb.png)

In case of error: 
1.	Input of Empty String:
![image](https://user-images.githubusercontent.com/98779204/185796530-8df1e049-6d88-432d-88fd-84f414318ed1.png)

 
2.	Invalid Expression:
 ![image](https://user-images.githubusercontent.com/98779204/185796534-d86124f3-e07f-4e1c-b59c-57caf50bf569.png)

3.	Dividing by Zero (0) i.e. 2+3/0
 ![image](https://user-images.githubusercontent.com/98779204/185796540-b272488e-8b04-4b06-b1a0-f9c4530c2d72.png)

And It execute ID: 20203038 for the Input string: ID/Id/id
 ![image](https://user-images.githubusercontent.com/98779204/185796543-190354dd-b4ef-4848-9c6a-730f8537f1df.png)


The Lab.java file contain main ( ) and the interface instructions.
 ![image](https://user-images.githubusercontent.com/98779204/185796546-f5099eae-1f90-402f-98b5-7d1aedc78e13.png)


The package ‘lab’ contains all the class, .java and .fxml file.
