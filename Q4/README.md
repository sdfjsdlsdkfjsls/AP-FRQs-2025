## Question 4 Analysis
### Numbered Pairs

This section contains my analysis of Question 4 (2D Arrays):

#### My initial approach during the exam:
- I don't quite remember my methods when I did this part in the exam, but I definitely remember having a for loop and initialized i as row to meet one of the conditions for a matching pair in part B. I also remember using Math.random() when initializing my puzzle array.
  
#### My revised solution after review:
- I noticed my part B method was clunky and very messy so I made the decision to clean it up by adding substitute variables. Also upon further inspection, I realized that I have left a major error in my response. I forgot to account for the possibility that the target number would be compared to itself. I decided to make it so that during the conditional check, the target number could not be in the current number's position.
  
#### Key concepts tested in this question:
- Usage of for loops.
- Initialization of 2D Arrays.
- Usage of if statements.
- Usage of Math.random().
  
#### What I learned from revisiting this problem:
- "Having clean code makes creating it quicker." Also, "give yourself better test cases".
