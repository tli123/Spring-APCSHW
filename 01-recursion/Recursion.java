public class Recursion {

    public int fibonacci(int n) {
	if (n == 0) {
	    return 0;
	}
	if (n == 1) {
	    return 1;
	}
	return fibonacci(n-1) + fibonacci(n-2);
    }

    public int bunnyEars2(int bunnies) {
	int counter = 0;
	if (bunnies == 0) {
	    return counter;
	}
	if (bunnies%2 == 1) {
	    counter += 2;
	}
	if (bunnies%2 == 0) {
	    counter += 3;
	}
	return counter + bunnyEars2(bunnies - 1);
    }

    public int strCount(String str, String sub) {
	int counter = 0;
	if ((str.length() <= sub.length()) && (!str.equals(sub))) {
	    return counter;
	}
	if (str.substring(0, sub.length()).equals(sub)) {
	    counter += 1;
	    return counter + strCount(str.substring(sub.length()), sub);
	}
	return counter + strCount(str.substring(1), sub);
    }

    public int sumDigits(int n) {
	if (n == 0) {
	    return 0;
	}
	return ((n%10) + sumDigits(n/10));
    }

    public String allStar(String str) {
	String ans = "";
	if (str.length() == 0) {
	    return ans;
	}
	if (str.length() == 1) { 
	    return ans + str.charAt(0) + allStar(str.substring(1));
	}
	return ans + str.charAt(0) + "*" + allStar(str.substring(1));
    }

    public int len(String s) {
	int ans = 0;
	if (s.equals("")) {
	    return ans;
	}
	return ans + 1 + len(s.substring(1));
    }

    public int count(String s, char c) {
	int ans = 0;
	if (s.equals("")) {
	    return 0;
	}
	if (s.charAt(0).equals(c)) {
	    ans++;
	}
	return count(s.substring(1), c);
    }
    
}
