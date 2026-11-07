package EX5_BC;

import unit4.collectionsLib.Stack;

public class Ex5_1C {


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

//        System.out.println(one(stack, 11));

        Stack<Character> stch = new Stack<>();
        stch.push('a');
        stch.push('b');
        stch.push('c');
        stch.push('d');
        stch.push('d');
        stch.push('c');
        stch.push('b');
        stch.push('a');


        Stack<Character> stch2 = new Stack<>();
        stch2.push('a');
        stch2.push('b');
        stch2.push('c');
        stch2.push('d');
        stch2.push('a');
        stch2.push('b');
        stch2.push('c');
        stch2.push('d');


//        System.out.println(two_b(stch2));


        System.out.println(three(stack, 5));


        Stack<String> stackst = new Stack<>();

        stackst.push("good-day");
        stackst.push("hello");
        stackst.push("fine");
        stackst.push("bla-bla-bla");

        System.out.println(four(stackst));

    }

    /**
     * checks if number n exists in stack
     *
     * @param st
     * @param n
     *
     * @return
     */

    public static boolean one(Stack<Integer> st, int n) {
        while (!st.isEmpty()) {
            if (st.pop() == n) {
                return true;
            }
        }
        return false;
    }

    /**
     * * check if stack is syumetrical
     * Complexity O(n)
     *
     * @param st
     *
     * @return boolean
     */
    public static boolean two(Stack<Character> st) {

        Stack<Character> temp = new Stack<>();

        int cc = 0;
        while (!st.isEmpty()) {
            temp.push(st.pop());
            cc++;
        }

        if (cc % 2 != 0) {
            return false;
        }

        char ch;

        for (int i = 0; i < cc; i++) {
            ch = temp.pop();

            if (!st.isEmpty() && st.top() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        return st.isEmpty() && temp.isEmpty();
    }

    /**
     * check if stack is symetrical
     * Complexity O(n)
     *
     * @param st
     *
     * @return boolean
     */
    public static boolean two_b(Stack<Character> st) {
        Stack<Character> temp = new Stack<>();
        Stack<Character> temp2 = new Stack<>();
        int cc = 0;
        while (!st.isEmpty()) {
            temp.push(st.pop());
            cc++;
        }

        if (cc % 2 != 0) {
            return false;
        }

        for (int i = 0; i < cc / 2; i++) {
            st.push(temp.pop());
        }

        while (!st.isEmpty()) {
            temp2.push(st.pop());
        }

        for (int i = 0; i < cc / 2; i++) {
            if (temp2.pop() != temp.pop()) {
                return false;
            }
        }
        return true;
    }

    /**
     * return number from stack at index n
     *
     * @param st
     * @param n
     *
     * @return int
     */
    public static int three(Stack<Integer> st, int n) {
        Stack<Integer> temp = new Stack<>();
        // stack > n
        // stack < n
        // stack is empty
        // stack == n

        int nm, res = -1, cc = 1;
        while (!st.isEmpty()) {
            nm = st.pop();
            temp.push(nm);
            if (cc == n) {
                res = nm;
            }
            cc++;
        }
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        return res;
    }

    /**
     * returns stack of string lengthes
     *
     * @param st
     *
     * @return
     */
    public static Stack<Integer> four(Stack<String> st) {

        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {

            temp.push(st.pop().length());
        }

        return temp;

    }

    public static void five() {
    }
}
