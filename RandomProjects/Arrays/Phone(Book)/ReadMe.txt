3. Phonebook

You will be given an array of phone numbers (strings) and an array of names (strings). After which, you will be given

strings on new lines, until you receive the command “done”. Find the numbers, which correspond to the names

and print them on the console in the following format:

? {name} -&gt; {number}

A number corresponds to a name when it’s located on the same position as its corresponding name in both arrays.

4. * Phone

This is an upgrade of the previous problem. Implement the phonebook functionality from the previous problem with

this additional functionality:

? call {number/name} -&gt; print “calling {name/number}…”

o If the sum of the digits (ignore other characters) of the number is odd, print “no answer”.

o If the sum of the digits (ignore other characters) of the number is even, print “call ended.

duration: {duration}”. The duration is calculated from the sum of the digits in the format

“mm:ss”

? message {number/name} -&gt; print “sending sms to {name/number}...”

o if the difference of the digits (ignore other characters) of the number is odd, print “busy”

o if the difference of the digits (ignore other characters) of the number is even, print “meet me

there”

Constraints

? The numbers will contain the digits 0-9 and might contain the plus sign +. They will always be valid and in

this format.

? The numbers and names will be unique – there will be no cases of repeated numbers or repeated names.

? The names and numbers will always be separated by exactly one whitespace.