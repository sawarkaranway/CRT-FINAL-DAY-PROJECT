import axios from "axios";

const BASE_URL =
    "http://localhost:8080/flights";

// GET ALL
export const getFlights = () => {

    return axios.get(BASE_URL);
};

// SAVE
export const saveFlight = (flight) => {

    return axios.post(
        BASE_URL,
        flight
    );
};

// DELETE
export const deleteFlight = (code) => {

    return axios.delete(
        `${BASE_URL}/${code}`
    );
};