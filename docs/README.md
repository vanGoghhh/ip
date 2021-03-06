# Zelda Bot User Guide
This is simple chat bot application I created for my CS2103 Project. The aesthetics of the bot is inspired by my favourite childhood game: Legend of Zelda.

![image](https://img.redbull.com/images/w_1280/q_auto,f_auto/redbullcom/2017/03/06/1331848012461_2/an-image-of-link-in-the-new-zelda-breath-of-the-wild-video-game)




# **Zelda Features**

The following features have been implemented in Zelda Bot:
1. [**`Adding`**](#addition) of tasks to the bot.
2. [**`Marking Completion`**](#marking) for completed tasks.
3. [**`Listing`**](#list) of all existing tasks.
4. [**`Deleting`**](#delete) existing tasks.
5. [**`Searching`**](#search) for tasks using keywords.
6. [**`Sorting`**](#sort) tasks according by order of their duedate (if any).
7. [**`Viewing Schedule`**](#schedule) for a particular month/date.
8. [**`Updating`**](#update) the description or duedate (if any) of a particular task.

## Feature Details

___
### 1. Adding of tasks <a name="addition"></a>

The user can add new tasks into ZeldaBot. The tasks can be a :
- deadline
- event
- todo


**Command:**

- **Todo** - todo 'task details'
- **Deadline** - deadline 'task details'/'Date & Time in yyyy-mm-dd format'
- **Event** - event 'task details'/'Date & Time in yyyy-mm-dd format'

**Usage:**

        todo deadlift
        
        deadline bench 2 plates/2020-12-12
        
        event squat 500lbs/2020-12-25
        
**Expected outcome:**

        Got it. This task is now added.
        [T][X] deadlift
        You have 1 tasks left in 
        your list!
        
        Got it. This task is now added.
        [D][X] bench 2 plates (by: 12 Dec 2020)
        You have 2 tasks left in 
        your list!
        
        Got it. This task is now added.
        [E][X] squat 500lbs (by: 25 Dec 2020)
        You have 3 tasks left in 
        your list!
---

### 2. Marking completion of tasks <a name="marking"></a>

Marks the completion of an existing task, indicated by a cross or a tick. The number of "done" in the command is the index of the task in your list.

**Command:**

done 'task index'

**Usage:**

    done 1

**Expected outcome:**

        Nice! I have completed 
        this task! [T][✓] deadlift
        
---

### 3. Listing of tasks <a name="list"></a>

List all existing tasks in your list.

**Command:**

    list

**Usage:**

    list

**Expected outcome:**
        
        Here are the tasks in your tasklist:
        1. [T][✓] deadlift
        2. [D][✓] bench 2 plates (by: 12 Dec 2020)
        3. [E][✓] squat 500lbs (by: 25 Dec 2020)
        
---

### 4. Deleting tasks <a name="delete"></a>

Deletes a tasks in your list of task. The number after "delete" is the index of the task in your list.

**Command:**

delete 'index number of task'

**Usage:**

    delete 1

**Expected outcome:**
        
        Got it. Deleting task.....
        [T][✓] deadlift
        Ypu have 2 tasks left in
        your list!
        
---

### 5. Searching for tasks <a name="search"></a>

Searches for a task in your list of tasks with a keyword which bears similarities to the description of the task.

**Command:**

find 'keyword matching task description'

**Usage:**
            
        find bench
            

**Expected outcome:**
    
        Here are the tasks in your list!
        1. [D][✓] bench 2 plates (by: 12 Dec 2020)
        
---

### 6. Sort tasks <a name="sort"></a>

Sorts deadlines and events in your list in order of their duedate, then insert all the todos at the end of the sorted list.

**Command:**

    sort

**Usage:**

    sort

**Expected outcome:**

        Your tasks has been sorted! :)
        1. [D][✓] bench 2 plates (by: 12 Dec 2020)
        2. [E][✓] squat 500lbs (by: 25 Dec 2020)
        3. [T][✓] deadlift
    
---

### 7. View schedule for a particular date or month <a name="schedule"></a>

Display all the tasks you have for a particular date or month. First character of input month must be capitalized and input date must be in yyyy-mm-dd format.

**Command:**

- schedule 'month'
- schedule 'date'

**Usage:**

    schedule December
    schedule 2020-12-12
    
**Expected outcome:**

        Here is your schedule for this month!
        1. [D][✓] bench 2 plates (by: 12 Dec 2020)
        2. [E][✓] squat 500lbs (by: 25 Dec 2020)
        
        Here is your schedule for this date!
        1. [D][✓] bench 2 plates (by: 12 Dec 2020)
        
---

### 8. Update task <a name="update"></a>

Update the description or duedate of an existing task in your list of task.

**Command:**

- update 'index of task you want to update' 'date or desc' 'new duedate or new description	'

**Usage:**
        
        update 2 desc go on a date
    
**Expected outcome:**

        This task:
        [D][✓] bench 2 plates (by: 12 Dec 2020)
       
        
        has been updated to this task:
        [D][✓] go on a date (by: 12 Dec 2020)
        
---
    
# Thanks for reading this user guide!
![image](https://d2skuhm0vrry40.cloudfront.net/2017/articles/1/8/8/7/1/7/8/zelda-breath-of-the-wild-walkthrough-guide-tips-4857-148829841233.jpg/EG11/resize/564x-1/quality/75/format/jpg)
    
