<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title></title>
    <style>
            table {
                width: 50%;
                margin: 20px auto;
                border-collapse: collapse;
                font-family: Arial, sans-serif;
            }
            table, th, td {
                border: 1px solid #ddd;
                padding: 8px;
                text-align: left;
            }
            th {
                background-color: #f2f2f2;
                color: #333;
                font-weight: bold;
            }
            tr:nth-child(even) {
                background-color: #f9f9f9;
            }
            tr:hover {
                background-color: #f1f1f1;
            }
    </style>
    </head>
    <body>
        <?php
        $Dosen = [
            'nama' => 'Elok Nur Hamdana' ,
            'domisili' => 'Malang' ,
            'jenis_kelamin' => 'Perempuan'
        ];
        ?>
        <table>
            <tr>
                <th>Field</th>
                <th>Information</th>
            </tr>
            <tr>
                <td>Nama</td>
                <td><?php echo $Dosen['nama']; ?></td>
            </tr>
            <tr>
                <td>Domisili</td>
                <td><?php echo $Dosen['domisili']; ?></td>
            </tr>
            <tr>
                <td>Jenis Kelamin</td>
                <td><?php echo $Dosen['jenis_kelamin']; ?></td>
            </tr>
        </table>
    </body>
</html>