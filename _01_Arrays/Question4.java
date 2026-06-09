/*
Problem: Majority Element

Description:
Find the element that appears more than n/2 times in an array.

Approach:
This solution uses Moore's Voting Algorithm.

Phase 1: Candidate Selection

* Maintain a candidate and a count.
* If count becomes 0, choose the current element as the new candidate.
* Increase count when the current element matches the candidate.
* Decrease count otherwise.
* At the end of this phase, the candidate is a potential majority element.

Phase 2: Verification

* Count the occurrences of the candidate.
* If occurrences > n/2, return the candidate.
* Otherwise, return -1.

Example:
Input:
[1, 1, 2, 1, 3, 5, 1]

Output:
1

Time Complexity: O(n)
Space Complexity: O(1)

Note:
If the problem guarantees the existence of a majority element,
the verification phase can be skipped.
*/

// Majority Element (appearing more than n/2 times)

class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 1, 3, 5, 1 };

        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {

        // Phase 1: Find a potential candidate using
        // Moore's Voting Algorithm

        int cand = -1, count = 0;

        for (int num : arr) {

            if (count == 0)
                cand = num;

            if (num == cand)
                count++;
            else
                count--;
        }

        /*
              If the problem guarantees the existence of a majority element, the algorithm can
        
              return 'cand' 
              
              directly and skip the verification phase below.
        */

        // Phase 2: Verify the candidate

        count = 0;

        for (int num : arr) {
            if (num == cand)
                count++;
        }

        return (count > arr.length / 2) ? cand : -1;
    }

}
