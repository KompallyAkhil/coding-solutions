// URL: https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
//
// Problem: K Sized Subarray Maximum
//
// Time Complexity: O(n)Auxiliary Space: O(k)

// Solution:
if(dq.getFirst() + k == i){
                dq.removeFirst();
            }
            if(i >= k-1){
                ansList.add(arr[dq.getFirst()]);
            }
        }






















        return ansList;
    }
}