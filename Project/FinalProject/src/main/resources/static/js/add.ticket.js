function sendToTicket(train_number, dep_station,arr_station, dep_date, dep_time, arr_date, arr_time, price) {
    $.ajax({
        type: "POST",
        url: "/ticket",
        data: {
            "trainNumber": train_number,
            "pickUpPoint": dep_station,
            "routePoint": arr_station,
            "departureDate": dep_date,
            "departureTime": dep_time,
            "arrivalDate": arr_date,
            "arrivalTime": arr_time,
            "price": price,

        },
        error: function (data) {
            alert(data.status)
        },
        success: function (data) {
            alert(data.status)
        }
    });
}