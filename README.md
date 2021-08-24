# Flight Booking Service
A simple flight booking service allow user to book the flight from one place to another place.
The current user data is static, looking forward to making it dynamic soon.

## Tools used
1. MySQL
2. Spring Data JPA
3. Lombook

## Endpoint
- http://localhost:8080/bookFlightTicket

## Request body
see `test.json`
```
{
  "passengerInfo": {
    "name": "somoh",
    "email": "somoh@gmail.com",
    "source": "Bangkok",
    "destination": "Korat",
    "travelDate": "24-8-2021",
    "pickupTime": "5.0 PM",
    "arrivalTime": "7.0 PM",
    "fare": 400.0
  },
  "paymentInfo": {
    "accountNo": "acc3",
    "cardType": "DEBIT"
  }
}
```

## Response body
```
{
    "status": "SUCCESS",
    "totalFare": 400.0,
    "pnrNo": "983ddc04",
    "passengerInfo": {
        "name": "somoh",
        "email": "somoh@gmail.com",
        "source": "Bangkok",
        "destination": "Korat",
        "travelDate": "24-08-2021",
        "pickupTime": "5.0 PM",
        "arrivalTime": "7.0 PM",
        "fare": 400.0,
        "pid": 1
    }
}
```