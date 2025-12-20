<script>
function validateForm() {
    let lat = document.forms["locForm"]["lat"].value;
    let lng = document.forms["locForm"]["lng"].value;

    if (lat === "" || lng === "") {
        alert("Please enter latitude and longitude");
        return false;
    }
    return true;
}
</script>
