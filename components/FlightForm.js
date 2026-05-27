import { useState } from "react";

function FlightForm(props) {

    const [flight, setFlight] = useState({

        flightCode: "",

        carrier: "",

        source: "",

        destination: "",

        cost: ""
    });

    const handleChange = (e) => {

        setFlight({

            ...flight,

            [e.target.name]:
                e.target.value
        });
    };

    const handleSubmit = (e) => {

        e.preventDefault();

        props.addFlight(flight);

        setFlight({

            flightCode: "",

            carrier: "",

            source: "",

            destination: "",

            cost: ""
        });
    };

    return (

        <div className="form-container">

            <h2>Add Flight</h2>

            <form onSubmit={handleSubmit}>

                <input
                    type="text"
                    name="flightCode"
                    placeholder="Flight Code"
                    value={flight.flightCode}
                    onChange={handleChange}
                    required
                />

                <input
                    type="text"
                    name="carrier"
                    placeholder="Carrier"
                    value={flight.carrier}
                    onChange={handleChange}
                    required
                />

                <input
                    type="text"
                    name="source"
                    placeholder="Source"
                    value={flight.source}
                    onChange={handleChange}
                    required
                />

                <input
                    type="text"
                    name="destination"
                    placeholder="Destination"
                    value={flight.destination}
                    onChange={handleChange}
                    required
                />

                <input
                    type="number"
                    name="cost"
                    placeholder="Cost"
                    value={flight.cost}
                    onChange={handleChange}
                    required
                />

                <button type="submit">
                    Save Flight
                </button>

            </form>

        </div>
    );
}

export default FlightForm;