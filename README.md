# voting-system

### Project Overview
This is a simple Voting System built using Spring Boot. The application allows users to register candidates, cast votes for them, view vote counts, and determine the winner based on the number of votes.

### Features Implemented
- Register a new candidate with an initial vote count of 0.
- Cast a vote for a candidate and increment their vote count.
- Retrieve the vote count of a specific candidate.
- List all candidates along with their current vote counts.
- Get the candidate with the highest number of votes (winner).

###  API Endpoints
- POST /api/entercandidate?name={name}
Registers a new candidate by providing the candidate's name. Initial vote count is set to 0.

- POST /api/castvote?name={name}
Cast a vote for the candidate by providing their name. Only valid candidates can be voted for.

- GET /api/countvote?name={name}
Retrieves the current vote count for the specified candidate.

- GET /api/listvote
Lists all candidates with their current vote counts.

- GET /api/getwinner
Retrieves the name of the candidate with the highest number of votes.
###  Screenshots
<br>

**Enter Candidate API**
<br>
![Screenshot 2024-11-10 163004](https://github.com/user-attachments/assets/7331b296-b800-464c-aa0e-38d699a4b820)
<br>
Endpoint: POST /api/entercandidate?name=ajay <br>
Description: Registers a new candidate named "Ajay".
<br>
<br>
**Cast Vote API**
<br>
![Screenshot 2024-11-10 163138](https://github.com/user-attachments/assets/a2849ca1-54bf-4280-a487-62aef5720aca)
<br>
Endpoint: POST /api/castvote?name=ajay <br>
Description: Casts a vote for the candidate "Ajay".
<br>
<br>

**Count Vote API**
<br>
![Screenshot 2024-11-10 163212](https://github.com/user-attachments/assets/c1f57082-e71d-4b3c-bfec-81aeff8a704c)
<br>
Endpoint: GET /api/countvote?name=ajay <br>
Description: Retrieves the current vote count for "Ajay".
<br>
<br>

**List Vote API**
<br>
![Screenshot 2024-11-10 163231](https://github.com/user-attachments/assets/8037bbc5-ca7b-4ff7-9d40-406b349e3303)
<br>
Endpoint: GET /api/listvote <br>
Description: Lists all candidates and their vote counts.
<br>
<br>

**Get Winner API**
<br>
![Screenshot 2024-11-10 163246](https://github.com/user-attachments/assets/4cd30feb-fe8d-4903-93e6-d2190ff68766)
<br>
Endpoint: GET /api/getwinner <br>
Description: Retrieves the candidate with the highest number of votes.

