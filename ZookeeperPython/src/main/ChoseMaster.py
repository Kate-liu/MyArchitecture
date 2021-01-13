# zookeeper 选主 Python 示例代码
handle = zookeeper.init("localhost:2181", my_connection_watcher, 10000, 0)

(data, stat) = zookeeper.get(handle, "/app/leader", True)

if stat is None:
    path = zookeeper.create(handle, "/app/leader", hostname:info, [ZOO_OPEN_ACL_UNSAFE], zookeeper.EPHEMERAL)

    if path is None:
        (data, stat) = zookeeper.get(handle, "/app/leader", True)
        # someone else is the leader
        # parse the string path that contains the leader address
    else:
    # we are the leader continue leading

else:
    # someone else is the leader
    # parse the string path that contains the leader address
