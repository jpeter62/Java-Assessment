import React, { useEffect, useState } from "react";
import axios from "axios";
import './Dashboard.css';

function Dashboard() {
  const [addresses, setAddresses] = useState([]);
  const [adName, setAdName] = useState("");
  const [adAddress, setAdAddress] = useState("");
  const [adEmail, setAdEmail] = useState("");
  const [adPhone, setAdPhone] = useState("");

  useEffect(() => {
    fetchAddresses();
  }, []);

  function fetchAddresses() {
    axios.get("http://localhost:8080/api/address").then((res) => {
      setAddresses(res.data);
    });
  }

  function addAddress() {
    const newAddress = {
      name: adName,
      address: adAddress,
      email: adEmail,
      phoneno: adPhone,
    };

    axios.post("http://localhost:8080/api/address", newAddress).then(() => {
      fetchAddresses(); // Refresh the list after adding
      resetForm(); // Clear the input fields
    });
  }

  function resetForm() {
    setAdName("");
    setAdAddress("");
    setAdEmail("");
    setAdPhone("");
  }

  return (
    <div>
      <h1>Address Details</h1>
      <div className="add-form">
        <h2>Add New Address</h2>
        <div>
          <label>Name:</label>
          <input
            type="text"
            placeholder="Enter name"
            value={adName}
            onChange={(e) => setAdName(e.target.value)}
          />
        </div>
        <div>
          <label>Address:</label>
          <input
            type="text"
            placeholder="Enter address"
            value={adAddress}
            onChange={(e) => setAdAddress(e.target.value)}
          />
        </div>
        <div>
          <label>Email:</label>
          <input
            type="email"
            placeholder="Enter email"
            value={adEmail}
            onChange={(e) => setAdEmail(e.target.value)}
          />
        </div>
        <div>
          <label>Phone Number:</label>
          <input
            type="text"
            placeholder="Enter phone number"
            value={adPhone}
            onChange={(e) => setAdPhone(e.target.value)}
          />
        </div>
        <button onClick={addAddress}>Add Address</button>
      </div>

      <div className="address-list">
        <h2>All Addresses</h2>
        {addresses.map((address) => (
          <div className="address-card" key={address.id}>
            <p>ID: <span>{address.id}</span></p>
            <h2>Name: {address.name}</h2>
            <p>Phone No: <span>{address.phoneno}</span></p>
            <p>Email: <span>{address.email}</span></p>
            <p>Address: <span>{address.address}</span></p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default Dashboard;
