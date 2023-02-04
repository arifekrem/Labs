import unittest
import a2

# Ask the TA if you should close all the files after every function!

def task1():    #Works
    '''
    How many QA pairs in QA_Pairs.txt? Here (q1, a1) is a pair, where q stands for
    question, and a for answer.
    '''
    p1counter = 0 #Counter of lines
    p1qcounter = 0 #Counter of questions
    p1acounter = 0 #Counter of answers
    p1file = open('QA_Pairs.txt') # opens the file
    p1line = p1file.readline() # reads a single line
    for p1line in p1file:
        p1counter += 1
        if 'q' == p1line[0].lower(): #If line starts with q, counts it as a question
            p1qcounter += 1
        else: #if line starts with a, counts it as an answer.
            p1acounter += 1
    p1file.close()
    return p1qcounter #I didn't return answer counter because i realized they were the same number



def task2():    #Works
    '''
    Are these pairs unique? For example: (q1, a1) (q1, a1) are identical and overlapping;
    (q1, a1) (q1, a2) are overlapping, and (q1, a1) (q2, a1) are overlapping as well. If not
    unique, find the overlapping pairs, and generate a unique_QA_Pairs.txt file and an
    Overlapping.txt file. The format of unique_QA_Pairs.txt and Overlapping.txt are the
    same as QA_Pairs.txt.

    For (q1, a1) (q1, a1), keep (q1, a1) once; put (q1, a1) in Overlapping.txt.
    For (q1, a1) (q1, a2) and (q1, a1) (q2, a1) , keep (q1, a1) (i.e., the first occurrence of a
    pair with q1) and delete the others; put (q1, a1), (q1, a2) and (q2, a1) in Overlapping.txt.
    
    If the original pairs are all unique, rename the original QA_Pairs.txt to be
    unique_QA_Pairs.txt, and still submit Overlapping.txt as an empty file.
    '''
    p2file1 =  open('QA_Pairs.txt', 'r') #Opens the file and reads it
    p2file2 = open('unique_QA_Pairs.txt', 'w') #Opens the file and write on it (creates a new file if it doesn't already exist)
    p2file3 = open('Overlapping.txt', 'w') #Opens the file and write on it (creates a new file if it doesn't already exist)
    
    p2lines = p2file1.readlines()

    qlist = [] #List of Questions
    qflag = [] #List of Numbers assigned to Questions
    alist = [] #List of Answers
    aflag = [] #List of Numbers assigned to Answers

    #Writing all the combinations of the  questions and answers into respective lists alongside their flags
    for i in range(1, len(p2lines), 2):
        if p2lines[i] in qlist: #Assigning the Numbers to Questions
            qlist.append(p2lines[i])
            qflag.append(1)
        else:
            qlist.append(p2lines[i])
            qflag.append(0)
        if p2lines[i-1] in alist: #Assigning the Numbers to Answers
            alist.append(p2lines[i-1])
            aflag.append(1)
        else:
            alist.append(p2lines[i-1])
            aflag.append(0)
    
    for i in range(len(qlist)):
        #Checking for unique conditions
        if qflag[i] == 0 and aflag[i] == 0:
            p2file2.writelines(alist[i])
            p2file2.writelines(qlist[i])
        
        #Rest of the conditions
        elif qflag[i] == 1 or aflag[i] == 1 :
            p2file3.writelines(alist[i])
            p2file3.writelines(qlist[i])
    
    p2file2.close()
    p2file3.close
    p2file2 = open('unique_QA_Pairs.txt', 'r')

    return p2file2.readline()

def task3():    # Works
    '''
    Store the pairs from unique_QA_Pairs.txt as a dictionary.
    '''
    global p3dict #Makes p3dict (I gave it a special name so it doesn't get mixed up with other dicts) global so we can use it in another function
    p3dict = {}
    with open('unique_QA_Pairs.txt') as p3:
        for line in p3:
            if line[0].lower() == 'q' and line not  in p3dict:
                key = line
            elif line[0].lower() == 'a' and line not  in p3dict: 
                val = line
                p3dict[key]  = val
    p3.close()
    return p3dict["question Who is Arya Stark's wife?\n"]


def task4():    # Works, I am not sure if I am supposed to remove line from the original file :/
    '''
    Extract all questions in a file called Questions.txt. Format sample is given as
    Questions.txt.
    '''
    with open('Questions.txt', 'a') as p4q:
        p4q.close()
    with open('QA_Pairs.txt', 'r') as p4:
        for line in p4:
            if line[0].lower() == 'q':
                with open('Questions.txt', 'r') as p4q:
                    if line not in p4q:
                        p4q.close()
                        with open('Questions.txt', 'a') as p4q:
                            p4q.write(line)
                    else:
                        pass
            else:
                pass
    p4.close()
    p4q.close()
    
    with open('Questions.txt', 'r') as p4: #Reads the first line and breaks so we can use it as a test case
        for line in p4:
            return line
            break


def task5():    # Works, I am not sure if I am supposed to remove line from the original file :/
    '''
    Extract all answers in a file called Answers.txt. Format sample is given as Answers.txt.
    '''
    with open('Answers.txt', 'a') as p5q:
        p5q.close()
    with open('QA_Pairs.txt', 'r') as p5:
        for line in p5:
            if line[0].lower() == 'a':
                with open('Answers.txt', 'r') as p5q:
                    if line not in p5q:
                        p5q.close()
                        with open('Answers.txt', 'a') as p5q:
                            p5q.write(line)
                    else:
                        pass
            else:
                pass
    p5.close()
    p5q.close()
    
    with open('Answers.txt', 'r') as p4: #Reads the first line and breaks so we can use it as a test case
        for line in p4:
            return line
            break

def task6():    # Works
    '''
    Find the term frequency of each word (that is, the count of each word) in 
    unique_QA_Pairs.txt, and output the frequencies as Frequency.txt. Format sample is
    given as Frequency.txt.
    '''
    p6file = open('QA_Pairs.txt', 'r')
    wcount = 0
    p6dic={}
    for line in p6file:
        for word in line.split():
            wcount += 1
            if word in p6dic:
                p6dic[word] += 1
            else:
                p6dic[word] = 1
    for word, freq in p6dic.items():
        p6dic[word]=freq / wcount
    
    p6file2 = open('Frequency.txt', 'w')
    for i in p6dic:
        p6file2.writelines(f'{i} , {p6dic[i]} \n')
    p6file2.close()
    
    with open('Frequency.txt', 'r') as p6file2: #Reads the first line and breaks so we can use it as a test case
        for line in p6file2:
            return line
            break

def task7():    # Works
    '''
    Rank the words by the decreasing order of their frequencies and output them as
    Decreasing_Frequency.txt. The format is the same as Frequency.txt.
    '''
    p7file = open('QA_Pairs.txt', 'r')
    wcount = 0
    p7dic={}
    for line in p7file:
        for word in line.split(): #This loop counts how many of that specific word is in the file
            wcount += 1
            if word in p7dic: 
                p7dic[word] += 1
            else:
                p7dic[word] = 1
    for word, freq in p7dic.items():
        p7dic[word]=freq / wcount #Divides how many of that word is in file with the total number of words
    p7dic = dict(sorted(p7dic.items(), key=lambda item: item[1], reverse=True))
    p7file2 = open('Decreasing_Frequency.txt', 'w')
    for i in p7dic:
        p7file2.writelines(f'{i} , {p7dic[i]} \n')
    p7file2.close()
    
    with open('Decreasing_Frequency.txt', 'r') as p7file2: #Reads the first line and breaks so we can use it as a test case
        for line in p7file2:
            return line
            break

class MyTests(unittest.TestCase):
    def test1(self):
        tsk1 = a2.task1()
        self.assertEqual(a2.task1(), 5725)
    
    def test2(self):
        tsk2 = a2.task2()
        self.assertEqual(a2.task2(), '\ufeffanswer Lady Catelyn Stark\n')
    
    def test3(self):
        tsk3 = a2.task3()
        self.assertEqual(a2.task3(), 'answer House Lannister\n')
    
    def test4(self):
        tsk4 = a2.task4()
        self.assertEqual(a2.task4(), "question Who is Arya Stark's wife?\n")
    
    def test5(self):
        tsk5 = a2.task5()
        self.assertEqual(a2.task5(), 'answer House Lannister\n')
    
    def test6(self):
        tsk6 = a2.task6()
        self.assertEqual(a2.task6(), '\ufeffanswer , 1.2822814351293822e-05 \n')
    
    def test7(self):
        tsk7 = a2.task7()
        self.assertEqual(a2.task7(), 'answer , 0.07344908060421101 \n')
    
if __name__ == '__main__':
    '''
    Our main function that runs the whole code.
    '''
    
    print(task1())
    
    task2()
    
    print(task3())

    task4()

    task5()

    task6() 

    task7()

    unittest.main(exit=False)