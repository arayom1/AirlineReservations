Airline Reservations System

A small airline has recently purchased a computer for its new automated reservations system. The task is to develop the new system by writing an application that assigns seats on each flight of the airline’s only plane, which has a capacity of 10 seats.

The application must display the following alternatives to the user:

"Please type 1 for First Class."
"Please type 2 for Economy"

If the user selects 1, the application assigns a seat in the first-class section (seats 1–5). If the user selects 2, the application assigns a seat in the economy section (seats 6–10). After assigning a seat, the application displays a boarding pass that shows the passenger’s seat number and whether it is in the first-class or economy section.

The seating chart of the plane is represented using a one-dimensional array of primitive type boolean. All elements of the array are initialized to false to indicate that all seats are initially empty. As each seat is assigned, the corresponding element of the array is set to true to indicate that the seat is no longer available. The application must ensure that a seat is never assigned more than once.

If the economy section is full, the application prompts the passenger to accept a seat in the first-class section, and vice versa. If the passenger agrees, the application assigns a seat in the alternate section. If the passenger declines, the application displays the message: "Next flight leaves in 3 hours.
