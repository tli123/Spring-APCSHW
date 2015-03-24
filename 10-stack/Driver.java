import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	myStack<String> s = new myStack<String>();
	System.out.println(s.toString());
	s.push("derp");
	s.push("hi");
	s.push("homework");
	s.push("classwork");
	s.pop();
	System.out.println(s.toString());
	
    }
}
