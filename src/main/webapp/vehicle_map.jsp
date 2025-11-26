<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Vehicle Map</title>

    <style>
        #output {
            white-space: pre;
            font-family: monospace;
        }
    </style>
</head>
<body>

<h2>Live Vehicle Locations (JSON)</h2>

<div id="output">Loading...</div>

<script>
    function loadData() {
        fetch("vehicleLocation")
            .then(res => res.json())
            .then(data => {
                document.getElementById("output").innerText =
                        JSON.stringify(data, null, 2);
            });
    }

    loadData();
    setInterval(loadData, 3000);
</script>

<br><br>
<a href="admin">Back</a>

</body>
</html>
