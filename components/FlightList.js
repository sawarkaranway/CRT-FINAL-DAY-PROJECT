function FlightList(props) {

    return (

        <div className="list-container">

            <h2>All Flights</h2>

            {
                props.flights.map((flight) => (

                    <div
                        key={flight.flightCode}
                        className="flight-card"
                    >

                        <h3>
                            {flight.flightCode}
                        </h3>

                        <p>
                            Carrier:
                            {flight.carrier}
                        </p>

                        <p>
                            Route:
                            {flight.source}
                            →
                            {flight.destination}
                        </p>

                        <p>
                            Cost:
                            ₹{flight.cost}
                        </p>

                        <button
                            onClick={() =>
                                props.deleteFlight(
                                    flight.flightCode
                                )
                            }
                        >
                            Delete
                        </button>

                    </div>
                ))
            }

        </div>
    );
}

export default FlightList;