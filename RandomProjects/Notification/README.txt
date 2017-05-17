Notifications

Write 2 methods:

static string ShowSuccess(string operation, string message)

{

    …

}

which prints a message in the following format:

Successfully executed {operation}.

==============================

Message: {message}.

and

static string ShowError(string operation, int code)

{

    …

}

which prints a message in the following format:

Error: Failed to execute {operation}.

==============================

Error Code: {code}.

Reason: {reason}.

The reason is determined by the code:

If the code is positive, the reason is "Invalid Client Data"

If the code is negative, the reason is "Internal System Failure"

Then, create a program which accepts an integer N.

On the next N lines, the user receives a result – "success" or "error". If the current operation is success, it should prompt the user for an operation and a message. If the operation is error, it should prompt the user for an operation and a code.

If neither "success", nor "error" is given, nothing should be printed and the program should continue.

Examples

Input

Output

2

success

User registration

User registered successfully

error

connecting to server

-403

Successfully executed User registration.

==============================

Message: User registered successfully.

Error: Failed to execute connecting to server.

==============================

Error Code: -403.

Reason: Internal System Failure.



Input

Output

3

success

Database query

Updated 2 rows

warning

error

credit card purchase

2

Successfully executed Database query.

==============================

Message: Updated 2 rows.

Error: Failed to execute credit card purchase.

==============================

Error Code: 2.

Reason: Invalid Client Data.